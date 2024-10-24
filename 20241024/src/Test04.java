import java.util.Scanner;

public class Test04 {

    // 배열의 특정 인덱스에 값을 삽입하는 메서드
    static int[] arrayInsOf(int[] a, int idx, int x) {
        // 유효성 검사: idx가 유효하지 않은 경우 원본 배열을 복사하여 반환
        if (idx < 0 || idx > a.length)
            return a.clone(); // 배열 복사
        else {
            int[] c = new int[a.length + 1]; // 크기가 1 증가한 새로운 배열 생성
            int i = 0;

            // 삽입할 위치까지 기존 요소 복사
            for (; i < idx; i++)
                c[i] = a[i];

            // 기존 배열의 요소를 삽입 위치 뒤로 이동
            for (; i < a.length; i++)
                c[i + 1] = a[i];

            c[idx] = x; // 지정된 인덱스에 새로운 값 삽입
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

        System.out.println("삽입할 인덱스: ");
        int idx = stdIn.nextInt(); // 삽입할 인덱스 입력

        System.out.println("삽입할 값: ");
        int n = stdIn.nextInt(); // 삽입할 값 입력

        // 값 삽입 후 새로운 배열 생성
        int[] y = arrayInsOf(x, idx, n);

        // 결과 출력
        for (int i = 0; i < y.length; i++)
            System.out.println("[" + i + "] = " + y[i]); // 삽입 후 배열 요소 출력
    }
}
