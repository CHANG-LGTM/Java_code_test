import java.util.Scanner;

public class Test07 {

    // 배열에서 주어진 인덱스부터 n개의 요소를 삭제하는 메소드
    static void aryRmvN(int[] a, int idx, int n) {
        // n이 0보다 크고, 인덱스가 유효한지 확인
        if (n > 0 && idx >= 0 && idx + n <= a.length) {
            int idx2 = idx + n - 1; // 삭제할 마지막 인덱스 계산

            // 마지막 인덱스가 배열 범위를 초과하지 않도록 조정
            if (idx2 > a.length - n - 1) {
                idx2 = a.length - n - 1;
            }

            // 주어진 인덱스부터 마지막 인덱스까지 요소를 왼쪽으로 이동
            for (int i = idx; i <= idx2; i++) {
                a[i] = a[i + n];
            }
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

        // 삭제할 요소의 인덱스 입력 받기
        System.out.println("삭제 할 요소의 인덱스:");
        int idx = stdIn.nextInt();

        // 삭제할 요소의 수 입력 받기
        System.out.println("삭제 요소의 수:");
        int n = stdIn.nextInt();

        // 주어진 인덱스부터 n개의 요소 삭제
        aryRmvN(a, idx, n);

        // 배열의 현재 상태 출력
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

        stdIn.close(); // Scanner 리소스 해제
    }
}
