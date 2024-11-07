package ch19.sec07;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    Socket socket; // 서버와의 연결을 위한 소켓
    DataInputStream dis; // 서버로부터 데이터를 입력받기 위한 스트림
    DataOutputStream dos; // 서버로 데이터를 전송하기 위한 스트림
    String chatName; // 클라이언트의 대화명

    // 서버에 연결하는 메서드
    public void connect() throws IOException {
        socket = new Socket("localhost", 50001); // 서버에 연결
        dis = new DataInputStream(socket.getInputStream()); // 입력 스트림 설정
        dos = new DataOutputStream(socket.getOutputStream()); // 출력 스트림 설정
        System.out.println("[클라이언트] 서버에 연결됨");
    }

    // 서버로부터 메시지를 받는 메서드
    public void receive() {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    String json = dis.readUTF(); // 서버로부터 메시지 받기
                    JSONObject root = new JSONObject(json); // JSON 형태로 파싱
                    String clientIp = root.getString("clientIp"); // 클라이언트 IP 추출
                    String clientName = root.getString("chatName"); // 클라이언트 이름 추출
                    String message = root.getString("message"); // 메시지 내용 추출
                    System.out.println("<" + clientName + "@" + clientIp + ">" + message); // 메시지 출력
                }
            } catch (Exception e1) {
                System.out.println("[클라이언트] 서버에 연결 끊김");
                System.exit(0); // 연결 끊어지면 프로그램 종료
            }
        });
        thread.start(); // 메시지 수신을 위한 스레드 시작
    }

    // 서버로 JSON 메시지를 보내는 메서드
    public void send(String json) throws IOException {
        dos.writeUTF(json); // 서버로 메시지 전송
        dos.flush(); // 데이터 강제로 전송
    }

    // 서버와의 연결을 종료하는 메서드
    public void unconnect() throws IOException {
        socket.close(); // 소켓 연결 종료
    }

    // main 메서드 - 프로그램 실행의 시작
    public static void main(String[] args) {
        try {
            ChatClient chatClient = new ChatClient(); // ChatClient 객체 생성
            chatClient.connect(); // 서버에 연결

            Scanner scanner = new Scanner(System.in); // 사용자 입력 받기 위한 스캐너 객체 생성
            System.out.println("대화명 입력:");
            chatClient.chatName = scanner.nextLine(); // 사용자 대화명 입력받기
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("command", "incoming"); // 명령어를 "incoming"으로 설정
            jsonObject.put("data", chatClient.chatName); // 대화명 입력
            String json = jsonObject.toString(); // JSON 문자열로 변환
            chatClient.send(json); // 서버로 대화명 전송

            chatClient.receive(); // 서버로부터 메시지를 받기 위한 스레드 시작

            System.out.println("-----------------------------------------");
            System.out.println("보낼 메시지를 입력하고 Enter");
            System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
            System.out.println("-----------------------------------------");

            // 메시지 입력을 받는 반복문
            while (true) {
                String message = scanner.nextLine(); // 사용자 메시지 입력받기
                if (message.toLowerCase().equals("q")) { // "q" 입력 시 종료
                    break;
                } else {
                    jsonObject = new JSONObject(); // 새로운 JSON 객체 생성
                    jsonObject.put("command", "message"); // 명령어를 "message"로 설정
                    jsonObject.put("data", message); // 입력된 메시지 내용
                    json = jsonObject.toString(); // JSON 문자열로 변환
                    chatClient.send(json); // 서버로 메시지 전송
                }
            }

            scanner.close(); // 스캐너 종료
            chatClient.unconnect(); // 서버와의 연결 종료
        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안됨"); // 서버 연결 실패 시 메시지 출력
        }
    }
}
