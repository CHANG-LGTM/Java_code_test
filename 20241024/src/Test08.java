import java.util.Scanner;

public class Test08 {

    // 정수의 절댓값을 반환하는 메서드
    static int absolute(int x) {
        return x >= 0 ? x : -x; // 0 이상이면 x 반환, 아니면 -x 반환
    }

    // long형 정수의 절댓값을 반환하는 메서드
    static long absolute(long x) {
        return x >= 0 ? x : -x; // 0 이상이면 x 반환, 아니면 -x 반환
    }

    // float형 수의 절댓값을 반환하는 메서드
    static float absolute(float x) {
        return x >= 0 ? x : -x; // 0 이상이면 x 반환, 아니면 -x 반환
    }

    // double형 수의 절댓값을 반환하는 메서드
    static double absolute(double x) {
        return x >= 0 ? x : -x; // 0 이상이면 x 반환, 아니면 -x 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성

        // 사용자로부터 값 입력 받기
        System.out.print("int 형 정수 a의 값: ");
        int a = stdIn.nextInt();
        System.out.print("long 형 정수 b의 값: ");
        long b = stdIn.nextLong();
        System.out.print("float 형 정수 c의 값: ");
        float c = stdIn.nextFloat();
        System.out.print("double 형 정수 d의 값: ");
        double d = stdIn.nextDouble();

        // 각 변수의 절댓값 출력
        System.out.println("a의 절댓값은 " + absolute(a) + "입니다.");
        System.out.println("b의 절댓값은 " + absolute(b) + "입니다.");
        System.out.println("c의 절댓값은 " + absolute(c) + "입니다.");
        System.out.println("d의 절댓값은 " + absolute(d) + "입니다.");
    }
}
