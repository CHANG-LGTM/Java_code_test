class Human02 {
    private String name;
    private int height;
    private int weight;

    Human02(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    String getName() { return name; }
    int getHeight() { return height; }
    int getWeight() { return weight; }

    void gainWeight(int w) { weight += w; }
    void reduceWeight(int w) { weight -= w; }
}

class HumanTester2 {
    public static void main(String[] args) {
        // Human01 대신 Human02를 사용합니다.
        Human02 gildong = new Human02("길동", 170, 60);
        Human02 chulsu = new Human02("철수", 166, 72);

        gildong.gainWeight(3);
        chulsu.reduceWeight(5);

        System.out.println("이름: " + gildong.getName());
        System.out.println("신장: " + gildong.getHeight() + "cm");
        System.out.println("체중: " + gildong.getWeight() + "kg");
        System.out.println();

        System.out.println("이름: " + chulsu.getName());
        System.out.println("신장: " + chulsu.getHeight() + "cm");
        System.out.println("체중: " + chulsu.getWeight() + "kg");
    }
}
