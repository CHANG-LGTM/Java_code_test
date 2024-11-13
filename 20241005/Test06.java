package Test02;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정수 a, b를 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();
        System.out.println("정수 b:");
        int b = stdIn.nextInt();

        // 두 값이 같으면
        if (a == b) {
            System.out.println("두 값이 같습니다.");
        }
        else {
            // 두 값이 다르면 작은 값과 큰 값을 구하기
            int min, max;

            // a가 b보다 작으면
            if (a < b) {
                min = a;  // a가 작은 값
                max = b;  // b가 큰 값
            }
            // b가 a보다 작으면
            else {
                min = b;  // b가 작은 값
                max = a;  // a가 큰 값
            }

            // 작은 값과 큰 값 출력
            System.out.println("작은 값은 " + min + "입니다.");
            System.out.println("큰 값은 " + max + "입니다.");
        }
    }
}
