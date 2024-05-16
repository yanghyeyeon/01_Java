package com.yanghyeyeon.practice;

public class Application1 {
    public static void main(String[] args) {

        int first = 10;
        int second =20;

        Application1 app1 = new Application1();

        System.out.println("최소값 : " + app1.minNumberOf(first,second));

        System.out.println("두 수의 합 : " + Application1.plusTwoNumber(first,second));


        Calculator calc = new Calculator();

        int plus = calc.plusTwoNumber(first,second);
        System.out.println("두 수의 합 : " + plus);

        int max = Calculator.maxNumber(first,second);
        System.out.println("최댓값 : " + max);


    }
    public int minNumberOf(int first, int second) {

        return (first > second) ? second : first;
    }

    public static int plusTwoNumber(int first, int second){

        return first + second;
    }
}
