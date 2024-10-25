class CatTester1 {
    public static void main(String[] args) {
        // Car 객체 생성: k3
        Car k3 = new Car("k3", "서울999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);

        // Car 객체 생성: k5
        Car k5 = new Car("k5", "서울999-98", 1660, 1525, 3695, 41.0, 35.0, 12.0);

        // k3의 스펙 출력
        k3.putSpec();
        System.out.println(); // 빈 줄 출력

        // k5의 스펙 출력
        k5.putSpec();
    }
}
