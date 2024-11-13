package Test01;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        // 사용자로부터 정숫값을 입력받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정숫값 입력받기
        System.out.print("정숫값 :");
        int n = stdIn.nextInt();  // n에 정수값 입력

        // n이 양수일 경우
        if (n > 0) {
            // n이 3으로 나누어지는지 확인
            if (n % 3 == 0)
                System.out.println("이 값은 3으로 나누어집니다.");
                // n을 3으로 나눈 나머지가 1인 경우
            else if (n % 3 == 1)
                System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
                // n을 3으로 나눈 나머지가 2인 경우
            else
                System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
        } else {
            // n이 양수가 아닐 경우
            System.out.println("이 값은 양수가 아닙니다.");
        }
    }
}
