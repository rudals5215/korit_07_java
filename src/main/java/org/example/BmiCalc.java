package org.example;

import java.util.Scanner;

public class BmiCalc {
    // call1()형태로 메서드화 시키는게 그다음 task
    public void calcBmi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        String result;
        double bmi = weight/(height * height);


        if (bmi < 18.5){
            result = "저체중";
        } else if (bmi >=18.5 && bmi <23 ) {
            result = "정상 체중";
        } else if (bmi >=23 && bmi <25) {
            result = "과체중";
        } else if (bmi >= 25 && bmi <30) {
            result = "비만 1단계";
        } else if (bmi >=30 && bmi < 35) {
            result = "비만 2단계";
        } else {
            result = "비만 3단계";
        }

        System.out.println(name +" 님의 BMI 지수는 "+ bmi + "으로" + result + "입니다.");
    }
    // call3() 형태로 메서드화 시킬겁니다.
    public void calcBmi(String name, double height, double weight){
        String result;
        double bmi = weight/((height/100) * (height/100));


        if (bmi < 18.5){
            result = "저체중";
        } else if (bmi >=18.5 && bmi <23 ) {
            result = "정상 체중";
        } else if (bmi >=23 && bmi <25) {
            result = "과체중";
        } else if (bmi >= 25 && bmi <30) {
            result = "비만 1단계";
        } else if (bmi >=30 && bmi < 35) {
            result = "비만 2단계";
        } else {
            result = "비만 3단계";
        }

        System.out.println(name +" 님의 BMI 지수는 "+ bmi + "으로" + result + "입니다.");
    }

    // call3() 형태 메서드기는 한테 매개변수가 객체인 경우
    public void calcBmi(Person person){


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        /*
            실행 예
            이름을 입력하세요 >>> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg)를 입력하세요 >>> 68
            김일님의 BMI 지수는 23.0으로 과체중입니다.
         */
        String result;
        double bmi = weight/(height * height);
        if (bmi < 18.5){
            result = "저체중";
        } else if (bmi >=18.5 && bmi <23 ) {
            result = "정상 체중";
        } else if (bmi >=23 && bmi <25) {
            result = "과체중";
        } else if (bmi >= 25 && bmi <30) {
            result = "비만 1단계";
        } else if (bmi >=30 && bmi < 35) {
            result = "비만 2단계";
        } else {
            result = "비만 3단계";
        }

        System.out.println(name +" 님의 BMI 지수는 "+ bmi + "으로" + result + "입니다.");


        BmiCalc bmiCalc1 = new BmiCalc();
        bmiCalc1.calcBmi();

        BmiCalc bmiCalc2 = new BmiCalc();
        bmiCalc2.calcBmi("김일",180,78);

        BmiCalc bmiCalc3 = new BmiCalc();
        bmiCalc3.calcBmi();
    }
}
