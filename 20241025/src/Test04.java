class Coodinate {
    private double x; // x 좌표
    private double y; // y 좌표

    // 생성자: x, y 좌표 초기화
    Coodinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // x 좌표 반환
    double getX() { return x; }

    // y 좌표 반환
    double getY() { return y; }

    // x 좌표 설정
    void setX(double x) { this.x = x; }

    // y 좌표 설정
    void setY(double y) { this.y = y; }

    // x, y 좌표 동시에 설정
    void set(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
