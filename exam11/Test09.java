import java.util.Scanner;

public class Test09 {

    // 두 배열의 요소를 교환하는 메소드
    static void aryExchng(int[] a, int[] b) {
        // 두 배열 중 작은 배열의 길이를 가져옴
        int n = a.length < b.length ? a.length : b.length;
        // 두 배열의 요소를 교환
        for (int i = 0; i < n; i++) {
            int t = a[i]; // a 배열의 현재 요소를 임시 변수에 저장
            a[i] = b[i];  // b 배열의 요소를 a 배열에 대입
            b[i] = t;     // 임시 변수의 값을 b 배열에 대입
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 배열 a의 요소 수 입력 받기
        System.out.println("배열 a의 요소 수:");
        int na = stdIn.nextInt();
        int[] a = new int[na]; // 배열 a 생성

        // 배열 a의 요소 입력 받기
        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        // 사용자로부터 배열 b의 요소 수 입력 받기
        System.out.println("배열 b의 요소 수:");
        int nb = stdIn.nextInt();
        int[] b = new int[nb]; // 배열 b 생성

        // 배열 b의 요소 입력 받기
        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "]:");
            b[i] = stdIn.nextInt();
        }
    }
}

