import java.util.Scanner; // Scanner 클래스를 사용하기 위해 임포트

class CoordinateTester1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성

        // 사용자에게 좌표 p 입력 요청
        System.out.println("좌표 p를 입력하세요.");
        System.out.println("X좌표:");
        double x = stdIn.nextDouble(); // X좌표 입력
        System.out.println("Y좌표:");
        double y = stdIn.nextDouble(); // Y좌표 입력

        // 좌표 p 객체 생성
        Coodinate p = new Coodinate(x, y);
        System.out.println("p=(" + p.getX() + "," + p.getY() + ")");

        // 좌표 q를 p와 같은 참조로 설정
        Coodinate q = p;
        q.set(9.9, 9.9); // q의 좌표를 (9.9, 9.9)로 설정

        // p와 q의 좌표 출력
        System.out.println("p=(" + p.getX() + "," + p.getY() + ")");
        System.out.println("q=(" + q.getX() + "," + q.getY() + ")");
    }
}
