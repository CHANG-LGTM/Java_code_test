import java.util.Scanner;

public class Test08 {

    // 배열에 주어진 인덱스에 값을 삽입하는 메소드
    static void artIns(int[] a, int idx, int x) {
        // 인덱스가 유효한지 확인
        if (idx >= 0 && idx < a.length) {
            // 배열의 끝에서부터 인덱스까지 요소를 오른쪽으로 이동
            for (int i = a.length - 1; i > idx; i--) {
                a[i] = a[i - 1];
            }
            // 주어진 인덱스에 새로운 값 삽입
            a[idx] = x;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 요소 수 입력 받기
        System.out.println("요소 수:");
        int num = stdIn.nextInt();

        // 입력 받은 요소 수에 맞춰 배열 생성
        int[] a = new int[num];

        // 배열에 값 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        // 삽입할 요소의 인덱스 입력 받기
        System.out.print("삽입할 요소의 인덱스:");
        int idx = stdIn.nextInt();

        // 삽입할 값 입력 받기
        System.out.print("삽입 할 값:");
        int n = stdIn.nextInt();

        // 주어진 인덱스에 값 삽입
        artIns(a, idx, n);

        // 배열의 현재 상태 출력
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

        stdIn.close(); // Scanner 리소스 해제
    }
}
