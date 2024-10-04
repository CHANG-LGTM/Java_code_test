package cho_03;

public class OverflowunderflowExam {
    public static void main(String[] args) {


        byte var1 =125;
        for (int i=0;i < 5; i++){
            var1++; // 126, 127, 128, 129, 130
            System.out.println("var1:"+ var1);
        }
        System.out.println("-------------");

        byte var2= -125;
        for (int i=0; i<5; i++){
            var2--; // -126, -127, -128, -129, -130
            System.out.println("var2:"+ var2);
        }
    }
}
