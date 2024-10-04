package cho_03;

public class InfinityAndNanExam {
    public static void main(String[] args) {
        int x =5;
        double y = 0.0;
        double z = x/y;

        System.out.println(z+2);

        if (Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 계산 불가");
        }else{
            System.out.println(z+2);
        }
    }
}
