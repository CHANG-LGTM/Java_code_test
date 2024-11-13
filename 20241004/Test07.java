package Test01;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 사용자로부터 정숫값을 입력받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정숫값 입력받기
        System.out.print("정숫값:");
        int n = stdIn.nextInt();  // n에 정수값 입력

        // n이 양수인지 확인
        if (n > 0) {
            // n이 양수일 경우, 5로 나누어지는지 확인
            if (n % 5 == 0)
                System.out.println("이 값은 5로 나누어집니다.");
            else
                System.out.println("이 값은 5로 나누어지지 않습니다.");
        } else {
            // n이 음수일 경우
            System.out.println("음의 정숫값을 입력했습니다.");
        }
    }
}
