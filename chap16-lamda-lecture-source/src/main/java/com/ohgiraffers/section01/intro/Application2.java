package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x,y) -> x + y;
        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20,10));

        // minus
        OuterCalculator.Minus minus = (x,y) -> x - y;
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20,10));

        // multiple
        OuterCalculator.Multiple multiple = (x,y) -> x * y;
        System.out.println("20과 10의 곱 : " + multiple.multiple(20,10));

        // division
        OuterCalculator.Division division = (x,y) -> x / y;
        System.out.println("20과 10의 나누기 : " + division.division(20,10));


    }
}
