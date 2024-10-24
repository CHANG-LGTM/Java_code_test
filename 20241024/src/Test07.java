import java.util.Scanner;

public class Test07 {

    // 두 정수의 최솟값을 반환하는 메서드
    static int min(int a, int b) {
        return a < b ? a : b; // 조건 연산자를 사용하여 최솟값 반환
    }

    // 세 정수의 최솟값을 반환하는 메서드
    static int min(int a, int b, int c) {
        int min = a; // 초기값을 a로 설정
        if (b < min) min = b; // b가 더 작으면 min을 b로 업데이트
        if (c < min) min = c; // c가 더 작으면 min을 c로 업데이트
        return min; // 최솟값 반환
    }

    // 정수 배열의 최솟값을 반환하는 메서드
    static int min(int[] a) {
        int min = a[0]; // 배열의 첫 번째 요소로 초기화
        for (int i = 1; i < a.length; i++) // 두 번째 요소부터 비교
            if (a[i] < min) // 현재 최솟값보다 작으면
                min = a[i]; // 최솟값 업데이트
        return min; // 최솟값 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성

        // 사용자로부터 정수 입력 받기
        System.out.print("x값: ");
        int x = stdIn.nextInt();
        System.out.print("y값: ");
        int y = stdIn.nextInt();
        System.out.print("z값: ");
        int z = stdIn.nextInt();

        // 배열 요소 수 입력 받기
        System.out.print("배열 a의 요소 수: ");
        int num = stdIn.nextInt();
        int[] a = new int[num]; // 주어진 수의 크기로 배열 생성

        // 배열 요소 입력
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt(); // 각 요소 입력
        }

        // 최솟값 계산 및 출력
        System.out.println("x, y의 최솟값은 " + min(x, y) + "입니다.");
        System.out.println("x, y, z의 최솟값은 " + min(x, y, z) + "입니다.");
        System.out.println("배열 a의 최솟값은 " + min(a) + "입니다.");
    }
}
