//점수를 입력받아서 합계, 평균, 최고점, 최저점을 표시
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("사람 수:");
        int n = stdIn.nextInt(); // 사람 수를 입력받음
        int[] points = new  int[n]; // 점수

        System.out.println("점수를 입력하세요.");
        int sum = 0; //합계
        for (int i =0; i<n; i++) {
            System.out.println((i+1)+"번의 점수:");
            points[i] = stdIn.nextInt();  //points[i]를 읽는다
            sum += points[i];             // sum에 points[i]를 더함
        }
        int max = points[0];              // 최고점
        int min = points[0];              // 최저점
        for (int i =1; i<n; i++) {
            if (points[i]>max) max = points[i];
            if (points[i]<min) min = points[i];
        }

        System.out.println("합계는"+sum + "점입니다.");
        System.out.println("평균은"+(double)sum/n + "점입니다.");
        System.out.println("최고점은"+max + "점입니다.");
        System.out.println("최저점은"+min + "점입니다.");
    }
}
