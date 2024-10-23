import java.util.Scanner;

// 임의의 비트를 조작
public class Test01 {
    // ---int형 비트 구성---//
    static void printBits(int x) {
        System.out.print("0b"); // 이진수 접두사 추가
        for (int i = 31; i >= 0; i--) {
            System.out.print((x >>> i & 1) == 1 ? '1' : '0');
        }
    }

    // ---x의 pos 위치에 있는 비트를 1로 변경한 값을 반환---//
    static int set(int x, int pos) {
        return x | (1 << pos);
    }

    // ---x의 pos 위치에 있는 비트를 0으로 변경한 값을 반환---//
    static int reset(int x, int pos) {
        return x & ~(1 << pos);
    }

    // ---x의 pos 위치에 있는 비트를 반전시킨 값을 반환---//
    static int inverse(int x, int pos) {
        return x ^ (1 << pos);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트를 변경합니다.");
        System.out.print("x: ");
        int x = stdIn.nextInt();
        System.out.print("pos: ");
        int pos = stdIn.nextInt();

        // pos의 유효성 검사
        if (pos < 0 || pos > 31) {
            System.out.println("비트 위치 pos는 0에서 31 사이여야 합니다.");
            return;
        }

        System.out.print("x                 = ");
        printBits(x);
        System.out.print("\nset(x,pos)      = ");
        printBits(set(x, pos));
        System.out.print("\nreset(x,pos)    = ");
        printBits(reset(x, pos));
        System.out.print("\ninverse(x,pos)  = ");
        printBits(inverse(x, pos));
        System.out.println();

        stdIn.close(); // Scanner 닫기
    }
}
