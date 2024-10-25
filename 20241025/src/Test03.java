class Car {
    private String name;      // 차 이름
    private String number;    // 차 번호
    private int width;        // 차 폭
    private int height;       // 차 높이
    private int length;       // 차 길이
    private double x;         // x 좌표
    private double y;         // y 좌표
    private double tankage;   // 연료 탱크 용량
    private double fuel;      // 현재 연료
    private double sfc;       // 연비 (km/리터)

    // 생성자: 차의 속성 초기화
    Car(String name, String number, int width, int height, int length,
        double tankage, double fuel, double sfc) {
        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.length = length;
        this.tankage = tankage;
        this.fuel = (fuel <= tankage) ? fuel : tankage; // 연료 초기화 (탱크 용량 이상은 저장하지 않음)
        this.sfc = sfc; // 연비 초기화
        x = y = 0.0; // 초기 좌표 설정
    }

    // 현재 x 좌표 반환
    double getX() { return x; }

    // 현재 y 좌표 반환
    double getY() { return y; }

    // 현재 연료 반환
    double getFuel() { return fuel; }

    // 차량의 스펙 출력
    void putSpec() {
        System.out.println("이름: " + name);
        System.out.println("번호: " + number);
        System.out.println("전폭: " + width + "mm");
        System.out.println("전고: " + height + "mm");
        System.out.println("전장: " + length + "mm");
        System.out.println("탱크: " + tankage + "리터");
        System.out.println("연비: " + sfc + "km/리터");
    }

    // 차량 이동 메서드
    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy); // 이동 거리 계산
        double f = dist / sfc; // 필요한 연료 계산

        if (f > fuel) // 연료가 부족한 경우
            return false;
        else {
            fuel -= f; // 연료 감소
            x += dx;   // x 좌표 업데이트
            y += dy;   // y 좌표 업데이트
            return true; // 이동 성공
        }
    }

    // 연료 보충 메서드
    void refuel(double df) {
        if (df > 0) { // 보충할 연료가 양수인 경우
            fuel += df; // 연료 보충
            if (fuel > tankage) // 탱크 용량 초과 시 조정
                fuel = tankage;
        }
    }
}
