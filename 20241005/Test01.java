package Test02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 실수를 입력받기 위해 준비
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 실수 a와 b를 입력받음
        System.out.println("실수 a:");
        double a = stdIn.nextDouble();  // 실수 a 입력 받기

        System.out.println("실수 b:");
        double b = stdIn.nextDouble();  // 실수 b 입력 받기

        // 큰 값을 저장할 변수 max 선언
        double max;

        // a가 b보다 크면 a가 max, 아니면 b가 max
        if (a > b)
            max = a;  // a가 더 클 경우 max에 a 값을 저장
        else
            max = b;  // b가 더 클 경우 max에 b 값을 저장

        // 결과 출력: 큰 값을 출력
        System.out.println("큰 쪽의 값은 " + max + "입니다.");
    }
}
