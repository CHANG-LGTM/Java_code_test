package Sec04;

public class SumFrom1To10Exam {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i=1; i<=10; i++){
            sum +=i;
        }
        System.out.println("1~" + (i-1) + "합" + sum);
    }
}
