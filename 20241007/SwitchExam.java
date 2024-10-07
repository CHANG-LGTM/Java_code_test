package ch04;

public class SwitchExam {

    public static void main(String[] args) {

        int score = 40;
        char grade;

        // 점수에 따라 등급 결정
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // switch 문을 사용하여 출력
        switch (grade) {
            case 'A':
                System.out.println("점수가 90보다 큽니다.");
                System.out.println("등급은 A입니다.");
                break;
            case 'B':
                System.out.println("점수가 80보다 작습니다.");
                System.out.println("등급은 B입니다.");
                break;
            case 'C':
                System.out.println("점수가 70보다 작습니다.");
                System.out.println("등급은 C입니다.");
                break;
            case 'D':
                System.out.println("점수가 60보다 작습니다.");
                System.out.println("등급은 D입니다.");
                break;
            case 'E':
                System.out.println("점수가 50보다 작습니다.");
                System.out.println("등급은 E입니다.");
                break;
            case 'F':
                System.out.println("점수가 40보다 작습니다.");
                System.out.println("등급은 F입니다.");
                break;
            default:
                System.out.println("유효하지 않은 점수입니다.");
        }
    }
}

