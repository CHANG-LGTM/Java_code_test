import java.util.Scanner;

public class Test06 {

    // 배열에서 주어진 인덱스의 요소를 삭제하는 메소드
    static void aryRmv(int[] a, int idx) {
        // 인덱스가 유효한 범위에 있는지 확인
        if (idx >= 0 && idx < a.length) {
            // 주어진 인덱스부터 배열의 끝까지 요소를 왼쪽으로 이동
            for (int i = idx; i < a.length - 1; i++)
                a[i] = a[i + 1];
            // 배열의 마지막 요소는 불필요하므로 기본값으로 설정 (선택 사항)
            a[a.length - 1] = 0; // 예를 들어 0으로 초기화
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 요소 수 입력 받기
        System.out.println("요소 수:");
        int num = stdIn.nextInt();

        // 입력 받은 요소 수에 맞춰 배열 생성
        int[] a = new int[num];

        // 배열에 값 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        // 삭제할 요소의 인덱스 입력 받기
        System.out.println("삭제 할 요소의 인덱스:");
        int idx = stdIn.nextInt();
    }
}
