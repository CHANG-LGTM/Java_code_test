package Test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 정수 a 값을 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();

        // 사용자로부터 정수 b 값을 입력받음
        System.out.println("정수 b:");
        int b = stdIn.nextInt();

        // 두 수의 차이를 구할 변수 diff 선언
        int diff;

        // a가 b보다 크거나 같으면 a에서 b를 빼고, 그렇지 않으면 b에서 a를 뺌
        if (a >= b)
            diff = a - b;
        else
            diff = b - a;

        // 두 값의 차이를 출력
        System.out.println("두 값의 차는 " + diff + "입니다.");
    }
}
