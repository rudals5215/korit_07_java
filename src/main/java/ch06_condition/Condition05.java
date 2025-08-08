package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String userGrade = "";
        final int A_GRADE = 90;
        final int B_GRADE = 80;
        final int C_GRADE = 70;
        final int D_GRADE = 60;


        if (score >= A_GRADE) {
            userGrade = "A";
        } else if (score >= B_GRADE) {
            userGrade = "B";
        } else if (score >= C_GRADE) {
            userGrade = "C";
        } else if (score >= D_GRADE) {
            userGrade = "D";
        } else {
            userGrade = "F";
        }
        System.out.println("당신의 점수는"+score+"점이고, 학점은 "+userGrade+"입니다.");


        // 해설
//        Scanner scanner = new Scanner(System.in);
        int score1 = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        score1 = scanner.nextInt();


        if (score1 > 89) {
            grade = "A";
        } else if (score1 > 79) {
            grade = "B";
        } else if (score1 > 69) {
            grade = "C";
        } else if (score1 > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는"+score1+"점이고, 학점은 "+grade+"입니다.");

    }
}
