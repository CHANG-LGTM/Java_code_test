package Test01;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        // 사용자로부터 정숫값을 입력받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정숫값 입력받기
        System.out.print("정숫값 :");
        int n = stdIn.nextInt();  // n에 정수값 입력

        // n이 양수일 경우
        if (n > 0) {
            // n이 10으로 나누어지는지 확인
            if (n % 10 == 0)
                System.out.println("이 값은 10의 배수입니다.");
            else
                System.out.println("이 값은 10의 배수가 아닙니다.");
        } else {
            // n이 음수일 경우
            System.out.println("음의 정숫값을 입력했습니다.");
        }
    }
}
