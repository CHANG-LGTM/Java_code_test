import java.util.Scanner;

public class Test01 {

    // 주어진 배열에서 특정 값의 인덱스를 찾아 배열로 반환하는 메소드
    static int[] arraySrchIdx(int[] a, int x) {
        int count = 0; // 찾은 요소의 개수를 세기 위한 변수

        // 배열을 순회하며 값 x의 개수를 센다
        for (int i = 0; i < a.length; i++)
            if (a[i] == x) count++;

        // 찾은 요소의 개수에 맞춰 인덱스를 저장할 배열 c 생성
        int[] c = new int[count--];

        // 배열을 거꾸로 탐색하여 값 x의 인덱스를 c 배열에 저장
        for (int i = a.length - 1; count >= 0; i--)
            if (a[i] == x)
                c[count--] = i;

        return c; // 인덱스 배열 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 요소 수 입력 받기
        System.out.print("요수 수:");
        int num = stdIn.nextInt();

        int[] x = new int[num]; // 입력 받을 배열 x 생성

        // 배열 x의 요소 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        // 탐색할 값 입력 받기
        System.out.println("탐색할 값:");
        int n = stdIn.nextInt();

        // 값 n의 인덱스를 찾기 위해 메소드 호출
        int[] b = arraySrchIdx(x, n);

        // 결과 출력
        if (b.length == 0)
            System.out.println("일치하는 요소가 없습니다."); // 일치하는 요소가 없을 경우
        else {
            System.out.println("일치하는 요소의 인덱스");
            for (int i = 0; i < b.length; i++)
                System.out.println(b[i]); // 일치하는 요소의 인덱스 출력
        }

        stdIn.close(); // Scanner 리소스 해제
    }
}
