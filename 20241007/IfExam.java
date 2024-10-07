package ch04;

public class IfExam {

    public static void main(String[] args) {

        int score = 40;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score >= 80) {
            System.out.println("점수가 80보다 작습니다.");
            System.out.println("등급은 B입니다.");

        } else if (score >= 70) {
            System.out.println("점수가 70보다 작습니다.");
            System.out.println("등급은 C입니다.");

        } else if (score >= 60) {
            System.out.println("점수가 60보다 작습니다.");
            System.out.println("등급은 D입니다.");

        } else if (score >= 50) {
            System.out.println("점수가 50보다 작습니다.");
            System.out.println("등급은 E입니다.");

        } else if (score >= 40) {
            System.out.println("점수가 40보다 작습니다.");
            System.out.println("등급은 F입니다.");
        }
    }
}



