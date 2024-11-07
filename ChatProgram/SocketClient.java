package ch19.sec07;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
    ChatServer chatServer; // ChatServer 객체
    Socket socket; // 서버와 연결된 소켓
    DataInputStream dis; // 서버로부터 데이터를 읽어올 입력 스트림
    DataOutputStream dos; // 서버로 데이터를 전송할 출력 스트림
    String clientIp; // 클라이언트의 IP 주소
    String chatName; // 클라이언트의 대화명

    // 생성자: ChatServer 객체와 Socket 객체를 받으며 연결을 설정
    public SocketClient(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer; // 서버 객체 저장
            this.socket = socket; // 소켓 객체 저장
            this.dis = new DataInputStream(socket.getInputStream()); // 입력 스트림 초기화
            this.dos = new DataOutputStream(socket.getOutputStream()); // 출력 스트림 초기화
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // 연결된 클라이언트의 IP 주소 받기
            this.clientIp = isa.getHostName(); // IP 주소를 얻음
            receive(); // 클라이언트로부터 메시지를 수신하기 위한 메서드 호출
        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리
        }
    }

    // 클라이언트로부터 메시지를 받는 메서드
    public void receive() {
        // 서버의 쓰레드 풀에서 실행되는 익명 스레드를 생성
        chatServer.threadPool.execute(() -> {
            try {
                while (true) {
                    // 클라이언트로부터 JSON 형식의 데이터를 읽음
                    String receiveJson = dis.readUTF();
                    JSONObject jsonObject = new JSONObject(receiveJson); // JSON으로 파싱
                    String command = jsonObject.getString("command"); // 명령어 추출

                    // 명령어에 따른 처리
                    switch (command) {
                        case "incoming":
                            this.chatName = jsonObject.getString("data"); // 대화명 설정
                            chatServer.sendToAll(this, "들어오셨습니다."); // 모든 클라이언트에게 입장 메시지 전송
                            chatServer.addSocketClient(this); // 클라이언트 추가
                            break;
                        case "message": // 메시지 전송 처리
                            String message = jsonObject.getString("data"); // 메시지 내용
                            chatServer.sendToAll(this, message); // 모든 클라이언트에게 메시지 전송
                            break;
                    }
                }
            } catch (IOException e) {
                // 연결 끊어졌을 때 처리
                chatServer.sendToAll(this, "나가셨습니다."); // 모든 클라이언트에게 퇴장 메시지 전송
                chatServer.removeSocketClient(this); // 클라이언트 목록에서 제거
            }
        });
    }

    // 서버로 JSON 형식의 데이터를 전송하는 메서드
    public void send(String json) {
        try {
            dos.writeUTF(json); // JSON 메시지 전송
            dos.flush(); // 강제로 출력
        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리
        }
    }

    // 소켓 연결을 종료하는 메서드
    public void close() {
        try {
            socket.close(); // 소켓 닫기
        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리
        }
    }
}
