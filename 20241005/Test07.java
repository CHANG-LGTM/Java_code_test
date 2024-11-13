package Test02;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 두 정수 a, b를 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();
        System.out.println("정수 b:");
        int b = stdIn.nextInt();

        // 만약 a가 b보다 작다면 두 값을 교환
        if (a < b) {
            int t = a;  // a와 b의 값을 교환하기 위한 임시 변수 t
            a = b;      // a에 b의 값을 할당
            b = t;      // b에 t (원래 a 값)을 할당
        }

        // a가 b보다 크거나 같도록 정렬되었음을 출력
        System.out.println("a >= b 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다."); // 정렬된 a 값 출력
        System.out.println("변수 b는 " + b + "입니다."); // 정렬된 b 값 출력
    }
}
