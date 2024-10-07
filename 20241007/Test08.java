import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("몇 개를 표시할까요?:");
        int n = stdIn.nextInt();
        if (n>0){
            int i =0;
            while (i<n){
                if (i % 2 ==0) //i가 짝수이면 '*'를 출력
                    System.out.print('*');
                else           //i가 홀수이면 '+'를 출력
                    System.out.print('+');
                i++;
            }
            System.out.println();
        }
    }
}
