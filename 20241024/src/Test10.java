import java.util.Scanner;

public class Test10 {

    // 1차원 배열을 출력하는 메서드
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]); // 각 요소 출력
            if (i < a.length - 1) {
                System.out.print(", "); // 마지막 요소가 아니면 쉼표 추가
            }
        }
        System.out.println(); // 줄바꿈
    }

    // 2차원 배열을 출력하는 메서드
    static void printArray(int[][] a) {
        int[][] width = new int[a.length][]; // 각 요소의 폭을 저장할 배열
        int max = 0; // 최대 열 길이

        // 각 행의 길이를 확인하여 최대 열 길이 계산
        for (int i = 0; i < a.length; i++) {
            width[i] = new int[a[i].length];
            if (a[i].length > max) {
                max = a[i].length; // 최대 열 길이 업데이트
            }
        }

        int[] maxwidth = new int[max]; // 각 열의 최대 폭 저장

        // 각 요소의 길이를 계산하여 폭 설정
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int value = a[i][j];
                width[i][j] = (value < 0) ? 1 : 0; // 음수 처리

                // 숫자의 자릿수 계산
                do {
                    width[i][j]++;
                    value /= 10;
                } while (value != 0);

                // 최대 폭 업데이트
                if (width[i][j] > maxwidth[j]) {
                    maxwidth[j] = width[i][j];
                }
            }
        }

        // 배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]); // 요소 출력
                // 요소의 폭에 맞춰 공백 추가
                for (int k = 0; k <= maxwidth[j] - width[i][j]; k++) {
                    System.out.print(' ');
                }
            }
            System.out.println(); // 행 끝에서 줄바꿈
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 1차원 배열 크기 입력
        System.out.print("1차원 행렬 x의 요소 수:");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        // 1차원 배열 요소 입력
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        // 2차원 배열 행 수 입력
        System.out.println("2차원 배열 y의 행 수:");
        int height = stdIn.nextInt();
        int[][] y = new int[height][];

        // 각 행의 열 수 입력
        for (int i = 0; i < y.length; i++) {
            System.out.print(i + "행째 열 수:");
            int width = stdIn.nextInt();
            y[i] = new int[width];
        }

        // 각 요소의 값 입력
        System.out.println("각 요소의 값을 입력하자.");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.printf("y[%d][%d]:", i, j);
                y[i][j] = stdIn.nextInt();
            }
        }

        // 배열 출력
        System.out.println("\n1차원 배열 x:");
        printArray(x);
        System.out.println("\n2차원 배열 y:");
        printArray(y);
    }
}
