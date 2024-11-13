package Test01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수를 입력 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 변수 A 입력 받기
        System.out.print("변수 A :");
        int a = stdIn.nextInt(); // 변수 A에 사용자 입력값 저장

        // 사용자로부터 변수 B 입력 받기
        System.out.print("변수 B :");
        int b = stdIn.nextInt(); // 변수 B에 사용자 입력값 저장

        // B가 A의 약수가 아니면
        if (!(a % b == 0))  // A를 B로 나누었을 때 나머지가 0이 아니라면
            System.out.println("B는 A의 약수가 아닙니다.");  // 약수가 아님
        else  // 그렇지 않으면
            System.out.println("B는 A의 약수입니다.");  // B는 A의 약수

    }
}
