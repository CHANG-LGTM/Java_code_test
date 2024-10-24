public class Test05 {

    // 두 행렬을 더하는 메서드
    static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
        // 행렬의 크기가 일치하는지 검사
        if (x.length != y.length || y.length != z.length)
            return false;

        for (int i = 0; i < x.length; i++) {
            if (x[i].length != y[i].length || y[i].length != z[i].length)
                return false; // 각 행의 길이 검사
        }

        // 행렬 덧셈 수행
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                z[i][j] = x[i][j] + y[i][j]; // 각 요소를 더하여 결과 행렬에 저장

        return true; // 성공적으로 덧셈이 완료된 경우 true 반환
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

    // main 메서드: 프로그램 실행의 진입점
    public static void main(String[] args) {
        // 두 개의 행렬 정의
        int[][] a = { {1, 2, 3}, {4, 5, 6} };
        int[][] b = { {6, 3, 4}, {5, 1, 2} };
        int[][] c = new int[2][3]; // 결과 행렬을 위한 초기화

        // 행렬 덧셈 수행 및 결과 출력
        if (addMatrix(a, b, c)) {
            System.out.println("행렬 a:");
            printMatrix(a); // 행렬 a 출력
            System.out.println("\n행렬 b:");
            printMatrix(b); // 행렬 b 출력
            System.out.println("\n행렬 c (a + b):");
            printMatrix(c); // 결과 행렬 c 출력
        } else {
            System.out.println("행렬의 크기가 일치하지 않습니다.");
        }
    }
}
