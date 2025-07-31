package ch07_loops;
/*
    1 2 3 4 5 6... 10
    11 12 13 14... 20
    ...
    91 92 93 94... 100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 20) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 30) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 40) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 50) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 60) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 70) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 80) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 90) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i < 100) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();

        // 1번 풀이 방법
        int num = 0;
        while(num < 100) {
            System.out.print(++num + " ");
            if (num % 10 == 0){
                System.out.println();
            }
        }

        // 2번 풀이 방법
        // 힌트 : 1 2 3 4 5 6 7 8 9 10 -> 을 출력하는게 한번의 반복
        int j = 1;
        while(j < 100) {
            System.out.println(j + " " + (j+1)+ " " + (j+2)+ " " + (j+3)+ " " + (j+4)+ " " + (j+5)+ " " + (j+6)
                    + " " + (j+7)+ " " + (j+8)+ " " + (j+9));
            j += 10;
        }
    }
}
