package ch06_condition;

import java.util.Scanner;

/*
    switch문
    형식 :
    switch(변수명)
        case 조건 1 :
            실행문 1;
            break;
        case 조건 2 :
            실행문 2;
            break;
        case 조건 3 :
            실행문 3;
            break;
        default:
            실행문 4;

 */
public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int selectedNum;

        System.out.println(" [메뉴 선택] ");
        System.out.println(" 1. Java를 공부한다 ");
        System.out.println(" 2. Puthon를 공부한다 ");
        System.out.println(" 3. JavaScript를 공부한다 ");
        System.out.println(" 4. Html를 공부한다 ");
        System.out.println(" 5. 자습 한다 ");
        System.out.println(" 6. 쉰다 ");
        System.out.print(" 메뉴를 선택하세요 >>> ");
//        selectedNum = scanner.nextInt();

        // 얘를 만약에 if 문으로 작성한다고 가정하면
        // 매력적이지 않은 예시
//        if (selectedNum < 1 || selectedNum > 6) {
//            System.out.println("불가능한 메뉴 선택입니다.");
//        } else {
//            if (selectedNum == 1){
//                System.out.println("메뉴 1을 선택하였습니다.");
//            } else if (selectedNum == 1) {
//                System.out.println("메뉴 2을 선택하였습니다.");
//            } else if (selectedNum == 2) {
//                System.out.println("메뉴 3을 선택하였습니다.");
//            } else if (selectedNum == 3) {
//                System.out.println("메뉴 4을 선택하였습니다.");
//            } else if (selectedNum == 4) {
//                System.out.println("메뉴 5을 선택하였습니다.");
//            } else if (selectedNum == 5) {
//                System.out.println("메뉴 6을 선택하였습니다.");
//            }
//        }

        // switch문 적용 사례
//        switch (selectedNum) {
//            case 1 :
//                System.out.println("메뉴1을 선택하였습니다.");
//                break;
//            case 2 :
//                System.out.println("메뉴2를 선택하였습니다.");
//                break;
//            case 3 :
//                System.out.println("메뉴3을 선택하였습니다.");
//                break;
//            case 4 :
//                System.out.println("메뉴4를 선택하였습니다.");
//                break;
//            case 5 :
//                System.out.println("메뉴5를 선택하였습니다.");
//                break;
//            case 6 :
//                System.out.println("메뉴6을 선택하였습니다.");
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다.");
//        }

        System.out.println(" [메뉴 선택] ");
        System.out.println(" a. Java를 공부한다 ");
        System.out.println(" b. Puthon를 공부한다 ");
        System.out.println(" c. JavaScript를 공부한다 ");
        System.out.println(" d. Html를 공부한다 ");
        System.out.println(" e. 자습 한다 ");
        System.out.println(" f. 쉰다 ");
        System.out.print(" 메뉴를 선택하세요 >>> ");

        String selectedChar = scanner.nextLine();
        switch (selectedChar) {
            case "a" :
                System.out.println("메뉴a을 선택하였습니다.");
                break;
            case "b" :
                System.out.println("메뉴b를 선택하였습니다.");
                break;
            case "c" :
                System.out.println("메뉴c을 선택하였습니다.");
                break;
            case "d" :
                System.out.println("메뉴d를 선택하였습니다.");
                break;
            case "e" :
                System.out.println("메뉴e를 선택하였습니다.");
                break;
            case "f" :
                System.out.println("메뉴f을 선택하였습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }

        //ch07_loops 패키지 생성 -> Loop01 -> main



    }
}
