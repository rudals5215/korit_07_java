package ch07_loops;
/*
    중첩 while문 (Nested - while)
    while(조건식1){
        반복실행문 1-a
        while(조건식2){
            반복실행문2
        }
        반복실행문1-b
    }
 */
public class Loop03 {
    public static void main(String[] args) {
        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
        // 2일차 1교시입니다. ...
        // 5일차 1교시입니다. ~ 5일차 3교시입니다.
        int day = 1;
        while(day < 6){
            int lesson = 1;     // 반복실행문 1-a에 해당합니다. 변수의 선언 및 초기화가 내부에서 일어남.(지역변수)
            while(lesson < 4) {
                System.out.print(day + "일차" + lesson + "교시입니다. ");     // 반복 실행문 2
                lesson++;
            }
            System.out.println();
            day++;              // 반복실행문 1-b에 해당하겠네요.
        }
//        System.out.println(lesson);       // 반복문 외부에서는 적용이 불가능

        // 명확한 설명은 추후에 해드리겠습니다. 다만 지금 여기서 도입된 개념은
        // scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점이 중요합니다.

        int num1 = 0;
        while(num1 < 100) {
            int num2 = 0;
            while(num2 < 11){
                System.out.print(num1 + num2++ + " ");
            }
            System.out.println();
            num1 += 10;
        }

        /*
            이상의 코드를 활용하여
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
            을 출력하시오.
         */

        int dan = 2;
        while (dan < 10) {
            int num = 1;
            while (num < 10) {
                System.out.print(dan  + " X " + num + " = " + (dan*num) + " ");
                num++;
            }
            System.out.println();
            dan++;
        }







    }
}
