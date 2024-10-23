import java.util.Scanner;

public class Test05 {
    //---배열 a의 요소로부터 key와 일치하는 가장 앞에 있는 요소를 선형탐색---//
    static int linearSearch(int[]a,int key){
        for (int i =0; i<a.length; i++)
            if (a[i]==key)
                return i;  //탐색 성공(인덱스 반환)
        return -1;         //탐색 실패(-1 반환)
    }
    //--- 배열 a의 요소로부터 key와 일치하는 가장뒤에 있는 요소를 선형탐색---//
    static int linearSearchR(int[]a,int key){
        for (int i = a.length -1; i>=0; i--)
            if (a[i]==key)
                return i;  //탐색 성공(인덱스 반환)
        return -1;         //탐색 실패(-1 반환)
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수:");
        int num = stdIn.nextInt();
        int[] x = new int[num];  //num개의 요소를 가지는 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        System.out.println("찾는 값:");  //키값 읽기
        int ky= stdIn.nextInt();

        int idTop = linearSearch(x, ky);  //배열x에서ky를 탐색
        int idBtm = linearSearchR(x, ky);  //배열x에서ky를 탐색

        if (idTop == -1)
            System.out.println("해당 값은 존재하지 않습니다.");
        else if (idTop == idBtm)
            System.out.println("해당 값은x[" + idTop + "]에 있습니다.");
        else {
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x[" + idTop + "]에 있습니다");
            System.out.println("가장 앞에 위치한 값은 x[" + idBtm + "]에 있습니다");
        }
    }
    }

