class Human01 {
    String name;   // 이름
    int height;    // 신장
    int weight;    // 체중
}

class HumanTester {
    public static void main(String[] args) {
        // Human01 객체 생성
        Human01 gildong = new Human01();  // 길동 객체
        Human01 chulsu = new Human01();   // 철수 객체

        // 길동의 정보 설정
        gildong.name = "길동";   // 이름 설정
        gildong.height = 170;    // 신장 설정
        gildong.weight = 60;     // 체중 설정

        // 철수의 정보 설정
        chulsu.name = "철수";    // 이름 설정
        chulsu.height = 166;     // 신장 설정
        chulsu.weight = 72;      // 체중 설정

        // 길동의 정보 출력
        System.out.println("이름: " + gildong.name);
        System.out.println("신장: " + gildong.height + "cm");
        System.out.println("체중: " + gildong.weight + "kg");
        System.out.println(); // 빈 줄 출력

        // 철수의 정보 출력
        System.out.println("이름: " + chulsu.name);
        System.out.println("신장: " + chulsu.height + "cm");
        System.out.println("체중: " + chulsu.weight + "kg");
    }
}
