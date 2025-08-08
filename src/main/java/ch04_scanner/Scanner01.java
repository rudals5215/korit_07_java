package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
        String name;
        name = "이경민";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        /*
            1. println과 print의 차이
                ln : lint new -> println으로 실행되면 출력문이 다 나오면 자동으로 개행됨.
                print로 작성할 경우에 동일 라인에 그대로 연결됨.
            2. nextLine/ nextInt / 어쩌고저쩌고 이런것들이 있다 구분해야겠다
         */
        System.out.print("연도를 입력하세요. >>> ");
        int year = scanner.nextInt();
        System.out.print("이름을 다시 입력하세요 >>> ");
        name = scanner.next();      // 입력을 lee kyeongmin
        System.out.println(name);
        /*
            2. next(Int / Double,... etc)  vs nextLine
                - nextLint은 띄어쓰기를 허용합니다. enter키, 즉 개행을 기준으로 데이터가 변수에 저장됨
                -> 그래서  24번 라인 실행결과가 lee이었습니다.
                - 나머지는 허용 안합니다. 띄어쓰기 하면 잘려서 대입됩니다.
         */
        System.out.print("올해는 몇 년도 인가요? >>> ");
        int year1 = scanner.nextInt();
        System.out.println("당신의 이름은? >>> ");
        String name1 = scanner.nextLine();
        System.out.println("연도 : " + year1);
        System.out.println("이름 : " + name1);

        /*
            이상의 코드에서의 문제점은 34번 라인이 실행됐을 때 데이터를 입력받지 않고
            그대로 넘어간다는 점입니다.
            왜 이런 문제가 생기냐면 nextInt()에서 값을 입력하고 저희가 enter를 치게 되는데,
            그 경우 다음 nextLine()에서는 enter키를 받아들여서 빈 값인 상태로 enter를 쳤다고
            인지되기 때문에
            곧장 35번 출력문으로 넘어갔기 때문입니다.

            해결방법 : enter 키를 받아주는 nextLine()를 하나 더 만들어 줍니다.
         */

        System.out.print("올해는 몇 년도 인가요? >>> ");
        int year2 = scanner.nextInt();

        scanner.nextLine();         // 배리어 역할을 하는 nextLine()
        // 얘는 사용되지 않을거니까 변수에 대입하지 않았습니다.

        System.out.print("당신의 이름은? >>> ");
        String name2 = scanner.nextLine();
        System.out.println("연도 : " + year2);
        System.out.println("이름 : " + name2);

        /*
            1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            나이를 입력하세요 >>> 19
            저는 올해 19살 입니다.
            내년에는 20살이 됩니다.

            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요
            김일 학생의 점수는 4.5 입니다.
         */

        System.out.print("나이를 입력하세요 >>> ");
        int year3 = scanner.nextInt();
        System.out.println("저는 올해 "+year3+"살이 됩니다.");
        System.out.println("내년에는 "+(year3+1)+"살이 됩니다.");
        System.out.println("저는 올해 "+year3+"살이 됩니다.\n내년에는 "+ (++year3) +"살이 됩니다.");

        System.out.print("점수를 입력하세요 >>> ");
        float score = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name3 = scanner.nextLine();
        System.out.println(name3+ "학생의 점수는 "+ score + "입니다.");

        System.out.println("풀이법 #1 : 배리어를 쓰는 방법");
        System.out.print("점수를 입력하세요 >>> ");
        double score2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name4 = scanner.nextLine();
        System.out.println(name4+ "학생의 점수는 "+ score2 + "입니다.");

        System.out.println("풀이법 #2 : nextLine()을 쓰지 않는 방법");
        System.out.print("점수를 입력하세요 >>> ");
        double score3 = scanner.nextDouble();
        System.out.print("이름을 입력하세요 >>> ");
        String name5 = scanner.next();
        System.out.println(name5+ "학생의 점수는 "+ score3 + "입니다.");

    }
}
