import java.util.Scanner;

class CoordinateTester1{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.println("X좌표:"); double x= stdIn.nextDouble();
        System.out.println("Y좌표:"); double y= stdIn.nextDouble();

        Coodinate p = new Coodinate(x,y);
        System.out.println("p=("+p.getX()+","+p.getY()+")");
        Coodinate q = p;
        q.set(9.9,9.9);
        System.out.println("p=("+p.getX()+","+p.getY()+")");
        System.out.println("q=("+p.getX()+","+p.getY()+")");
    }
}