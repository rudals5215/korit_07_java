package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leepYear = "";
        int year = 0;
        System.out.print("년도를 입력하시오 >>> ");
        year = scanner.nextInt();

        // 논리연산자를 이용한 풀이
        if ((year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0)) {
                leepYear = "윤년입니다.";
        } else {
            leepYear = "윤년이 아닙니다.";
        }
        System.out.println(year+ "년은 "+ leepYear);

    }
}
