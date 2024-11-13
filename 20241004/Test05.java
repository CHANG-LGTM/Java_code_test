package Test01;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 사용자로부터 정수값을 입력 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정숫값 입력 받기
        System.out.print("정숫값 :");
        int n = stdIn.nextInt();  // 입력받은 정수값을 변수 n에 저장

        // 입력받은 값이 양수인 경우
        if (n > 0)
            System.out.println("값이 양수입니다.");
            // 입력받은 값이 음수인 경우
        else if (n < 0)
            System.out.println("값이 음수입니다.");
            // 입력받은 값이 0인 경우
        else
            System.out.println("값이 0입니다.");

    }
}
