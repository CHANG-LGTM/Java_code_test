import java.util.Scanner;

public class Test03 {

    // 배열에서 특정 인덱스부터 n개의 요소를 삭제하는 메서드
    static int[] arrayRmvOfN(int[] a, int idx, int n) {
        // 유효성 검사: n, idx가 유효하지 않은 경우 원본 배열을 복사하여 반환
        if (n < 0 || idx < 0 || idx >= a.length)
            return a.clone(); // 배열 복사
        else {
            // 삭제할 요소의 범위 조정
            if (idx + n > a.length)
                n = a.length - idx; // 삭제할 개수가 배열의 남은 길이를 초과하지 않도록 조정

            int[] c = new int[a.length - n]; // 새로운 배열 생성
            int i = 0;

            // 삭제 전 요소 복사
            for (; i < idx; i++)
                c[i] = a[i];

            // 삭제 후 요소 복사
            for (; i < a.length - n; i++)
                c[i] = a[i + n];

            return c; // 수정된 배열 반환
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
        System.out.print("요소 수: ");
        int num = stdIn.nextInt(); // 배열의 크기 입력

        int[] x = new int[num]; // 입력 받을 배열 생성

        // 배열 요소 입력
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt(); // 각 요소 입력
        }

        System.out.println("삭제를 시작할 인덱스: ");
        int idx = stdIn.nextInt(); // 삭제 시작 인덱스 입력

        System.out.println("삭제할 요소의 개수: ");
        int n = stdIn.nextInt(); // 삭제할 요소 개수 입력

        // 요소 삭제 후 새로운 배열 생성
        int[] y = arrayRmvOfN(x, idx, n);

        // 결과 출력
        for (int i = 0; i < y.length; i++)
            System.out.println("[" + i + "] = " + y[i]); // 삭제 후 배열 요소 출력
    }
}
