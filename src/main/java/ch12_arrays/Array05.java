package ch12_arrays;

import java.util.Scanner;

/*
    메서드를 정의해도 되고 main에 바로 하셔도 상관없습니다
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {

    public void writeElements(){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        String[] scores = new String[index];
        index = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0;i < (scores.length-1); i++){
            System.out.print(scores[i]+"+ ");
        }
        System.out.println(scores[4]);
    }

    public void printElements(String[] strArray){
        String[] scores = {"A","B","C","D","F"};
        for (int i = 0;i < (scores.length-1); i++){
            System.out.print(scores[i]+"+ ");
        }
        System.out.println(scores[4]);
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();
        array05.writeElements();

        String[] scores = {"A","B","C","D","F"};
        for (int i = 0;i < (scores.length-1); i++){
            System.out.print(scores[i]+"+ ");
        }
        System.out.println(scores[scores.length-1]);
    }
}
