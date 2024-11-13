package Test02;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 세 개의 정수 a, b, c를 입력받음
        System.out.println("정수 a:");
        int a = stdIn.nextInt();
        System.out.println("정수 b:");
        int b = stdIn.nextInt();
        System.out.println("정수 c:");
        int c = stdIn.nextInt();

        // 처음에 a를 최솟값으로 설정
        int min = a;

        // b가 현재 min 값보다 작으면 min을 b로 변경
        if (b < min) min = b;

        // c가 현재 min 값보다 작으면 min을 c로 변경
        if (c < min) min = c;

        // 최솟값을 출력
        System.out.println("최솟값은 " + min + "입니다.");
    }
}
