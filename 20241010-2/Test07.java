import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("몇 cm부터:");
        int hMin = stdIn.nextInt();

        System.out.println("몇 cm까지:");
        int hMax = stdIn.nextInt();

        System.out.println("몇 cm 단위:");
        int step = stdIn.nextInt();

        System.out.println("신장 표준 체중");
        System.out.println("--------------");

        for (int i = hMin; i<=hMax; i+=step)
            System.out.println(i+""+0.9*(i-100));
    }
}
