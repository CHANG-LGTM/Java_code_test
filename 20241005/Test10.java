package Test02;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 사용자로부터 월을 입력받기 위해 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자에게 월을 입력받음
        System.out.print("몇 월입니까?: ");
        int month = stdIn.nextInt();

        // 입력된 월을 기준으로 계절을 결정하는 switch문
        switch (month) {
            // 3월, 4월, 5월은 봄
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            // 6월, 7월, 8월은 여름
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            // 9월, 10월, 11월은 가을
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            // 12월, 1월, 2월은 겨울
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            // 1~12월이 아닌 숫자가 입력된 경우
            default:
                System.out.println("그런 월은 없습니다.");
                break;
        }
    }
}
