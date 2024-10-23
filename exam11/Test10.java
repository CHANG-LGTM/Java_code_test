import java.util.Scanner;

public class Test10 {

    // 배열을 복사하여 새 배열을 반환하는 메소드
    static int[] arrayClone(int[] a) {
        int[] c = new int[a.length]; // 복사할 배열 생성
        // 원본 배열의 요소를 복사
        for (int i = 0; i < c.length; i++)
            c[i] = a[i];
        return c; // 복사한 배열 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 요소 수 입력 받기
        System.out.println("요소 수:");
        int num = stdIn.nextInt();

        int[] x = new int[num]; // 배열 x 생성
        // 배열 x의 요소 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        // 배열 x를 복사하여 배열 y 생성
        int[] y = arrayClone(x);
        System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");

        // 배열 y의 요소 출력
        for (int i = 0; i < num; i++)
            System.out.println("y[" + i + "]=" + y[i]);

        stdIn.close(); // Scanner 리소스 해제
    }
}
