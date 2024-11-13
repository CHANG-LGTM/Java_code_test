package Test02;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정수 a와 b 값을 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();
        System.out.println("정수 b:");
        int b = stdIn.nextInt();

        // a와 b의 차이를 계산 (삼항 연산자 사용)
        // 만약 a가 b보다 크거나 같으면 a-b, 그렇지 않으면 b-a를 계산
        int diff = a >= b ? a - b : b - a;

        // 차이가 10 이하이면 해당 메시지 출력, 그렇지 않으면 다른 메시지 출력
        if (diff <= 10)
            System.out.println("두 값의 차이는 10이하 입니다.");
        else
            System.out.println("두 값의 차는 11이상입니다.");
    }
}
