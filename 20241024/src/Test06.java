import java.util.Scanner;

public class Test06 {

    // 2차원 배열을 깊은 복사하는 메서드
    static int[][] aryClone2(int[][] a) {
        // 복사할 배열을 선언
        int[][] c = new int[a.length][];

        for (int i = 0; i < a.length; i++) {
            // 각 행의 길이에 맞게 새로운 배열 생성
            c[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) // j를 i++에서 j++로 수정
                c[i][j] = a[i][j]; // 원본 배열의 요소 복사
        }
        return c; // 복사된 배열 반환
    }

    // 행렬을 출력하는 메서드
    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " "); // 각 요소 출력
            }
            System.out.println(); // 각 행 출력 후 줄바꿈
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
        System.out.print("행렬의 행 수: ");
        int height = stdIn.nextInt(); // 행 수 입력
        System.out.print("행렬의 열 수: ");
        int width = stdIn.nextInt(); // 열 수 입력

        // 지정된 크기의 2차원 배열 생성
        int[][] a = new int[height][width];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("a[%d][%d]: ", i, j); // 배열 요소 입력 프롬프트
                a[i][j] = stdIn.nextInt(); // 사용자로부터 입력 받기
            }
        }

        // 원본 배열을 깊은 복사
        int[][] ca = aryClone2(a);

        // 원본 행렬 출력
        System.out.println("행렬 a:");
        printMatrix(a);

        // 복사된 행렬 출력
        System.out.println("행렬 a의 복사본:");
        printMatrix(ca);
    }
}
