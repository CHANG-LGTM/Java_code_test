package Test02;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 세 개의 정수 a, b, c를 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();
        System.out.println("정수 b:");
        int b = stdIn.nextInt();
        System.out.println("정수 c:");
        int c = stdIn.nextInt();

        // 중앙값을 저장할 변수
        int med;

        // a가 b보다 크거나 같으면
        if (a >= b) {
            // b가 c보다 크거나 같으면 b가 중앙값
            if (b >= c) {
                med = b;
            }
            // c가 a보다 크면 c가 중앙값
            else if (a <= c) {
                med = a;
            }
            // 그 외의 경우, c가 중앙값
            else {
                med = c;
            }
        }
        // b가 a보다 크면
        else if (a > c) {
            med = a;
        }
        // b가 c보다 크면 c가 중앙값
        else if (b > c) {
            med = c;
        }
        // 그 외의 경우, b가 중앙값
        else {
            med = b;
        }

        // 중앙값 출력
        System.out.println("중앙값은 " + med + "입니다.");
    }
}
