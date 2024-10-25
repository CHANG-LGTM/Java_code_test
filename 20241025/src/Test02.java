class Human02 {
    private String name;   // 이름
    private int height;    // 신장
    private int weight;    // 체중

    // 생성자: 이름, 신장, 체중 초기화
    Human02(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    // 이름 반환
    String getName() { return name; }

    // 신장 반환
    int getHeight() { return height; }

    // 체중 반환
    int getWeight() { return weight; }

    // 체중 증가
    void gainWeight(int w) { weight += w; }

    // 체중 감소
    void reduceWeight(int w) { weight -= w; }
}

class HumanTester2 {
    public static void main(String[] args) {
        // Human02 객체 생성
        Human02 gildong = new Human02("길동", 170, 60);  // 길동 객체
        Human02 chulsu = new Human02("철수", 166, 72);   // 철수 객체

        // 체중 조절
        gildong.gainWeight(3);   // 길동의 체중 증가
        chulsu.reduceWeight(5);  // 철수의 체중 감소

        // 길동의 정보 출력
        System.out.println("이름: " + gildong.getName());
        System.out.println("신장: " + gildong.getHeight() + "cm");
        System.out.println("체중: " + gildong.getWeight() + "kg");
        System.out.println(); // 빈 줄 출력

        // 철수의 정보 출력
        System.out.println("이름: " + chulsu.getName());
        System.out.println("신장: " + chulsu.getHeight() + "cm");
        System.out.println("체중: " + chulsu.getWeight() + "kg");
    }
}
