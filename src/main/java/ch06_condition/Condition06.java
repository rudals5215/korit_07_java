package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05의 코드는
    100초과/ 0 미만의 점수가 입려됐을 때 각각 A / F라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고 안내를 하려면
     어떻게 할 수 있을까요?
     100 초과 / 0 미만의 경우에는 grade를 X라고 하겠습니다.

     참고 사항 : 선수학습 하신 분들은 중첩 if 문을 사용하지 않고 작성하겠습니다.
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
//        score >= 0 or score < 101;

        // 비효율적이지만 일단 작동은 하는 지저분한 코드 예시
//        if (score > 89 && score  < 101) {
//            grade = "A";
//        } else if (score > 79 && score  < 10) {
//            grade = "B";
//        } else if (score > 69 && score  < 10) {
//            grade = "C";
//        } else if (score > 59 && score  < 10) {
//            grade = "D";
//        } else if (score < 0 || score >= 101){
//            grade = "X";
//        } else {
//            grade = "F";
//        }

        // 논리 연산자를 포함한 풀이
        if (score > 100 || score < 0) { // 얘가 false라면 score 는 0점 이상이면서 100 이하
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59 ) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는"+score+"점이고, 학점은 "+grade+"입니다.");
    }
}
