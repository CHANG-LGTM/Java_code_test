package Test01;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 사용자로부터 점수를 입력받기 위해 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 점수 입력을 요구하는 출력문
        System.out.print("점수: ");

        // 사용자로부터 점수를 정수로 입력받음
        int point = stdIn.nextInt();  // 사용자로부터 점수를 입력받아 'point' 변수에 저장

        // 점수가 0 이상 49 이하일 경우
        if (point >= 0 && point <= 49)
            System.out.println("가");  // '가' 학점 출력
            // 점수가 50 이상 59 이하일 경우
        else if (point >= 50 && point <= 59)
            System.out.println("양");  // '양' 학점 출력
            // 점수가 60 이상 69 이하일 경우
        else if (point >= 60 && point <= 69)
            System.out.println("미");  // '미' 학점 출력
            // 점수가 70 이상 79 이하일 경우
        else if (point >= 70 && point <= 79)
            System.out.println("우");  // '우' 학점 출력
            // 점수가 80 이상 100 이하일 경우
        else if (point >= 80 && point <= 100)
            System.out.println("수");  // '수' 학점 출력
            // 그 외의 잘못된 점수 범위일 경우
        else
            System.out.println("잘못된 점수입니다.");  // 잘못된 점수 입력에 대한 경고 메시지 출력
    }
}
