import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수:");
        int x = stdIn.nextInt();

        System.out.printf("8진수는 %o 이고 16진수는 %x 입니다.\n",x,x);
    }
}
