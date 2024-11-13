package Test01;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수값을 입력받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 변수 a의 값 입력받기
        System.out.print("변수 a:");
        int a = stdIn.nextInt();  // a에 정수값 입력

        // 사용자로부터 변수 b의 값 입력받기
        System.out.print("변수 b:");
        int b = stdIn.nextInt();  // b에 정수값 입력

        // 조건문을 사용하여 a와 b의 크기 비교
        if (a > b)  // a가 b보다 크면
            System.out.println("a가 크다.");
        else if (a < b)  // b가 a보다 크면
            System.out.println("b가 크다.");
        else  // a와 b가 같으면
            System.out.println("a와 b가 같다.");

    }
}
