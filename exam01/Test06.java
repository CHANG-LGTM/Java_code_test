package Test01;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.print("변수 a:"); int a = stdIn.nextInt();

        System.out.print("변수 b:"); int b = stdIn.nextInt();

        if (a > b)
            System.out.println("a가 크다.");
        else if (a < b)
            System.out.println("b가 크다.");
        else
            System.out.println("a와 b가 같다.");


        }
    }

