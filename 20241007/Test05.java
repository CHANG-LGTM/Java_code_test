import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");
        int x;
        do{
            System.out.println("양의 정숫값:");
            x= stdIn.nextInt();
        } while (x<=0);
        // do문 종료 시 x는 반드시 양의 값이 된다.

        //whlie문
        while (x>=0)
            System.out.println(x--); // x 값을 표시 후 감소
            System.out.println("x의 값이" +x+"이 됐습니다."); // x값 표시

    }
}
