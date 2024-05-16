package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();

        //더하기
        int plus = calc.nonStaticPlusNumber(num1,num2);
        System.out.println("더한 값은 : " + plus);

        //빼기
        int minus = calc.nonStaticMinusNumber(num1,num2);
        System.out.println("뺀 값은 : " + minus);

        //곱하기
        int multiple = calc.nonStaticMultipleNumber(num1,num2);
        System.out.println("곱한 값은 : " + multiple);

        //나누기
        int divide = calc.nonStaticDivideNumber(num1,num2);
        System.out.println("나눈 값은 : " + divide);

        //나머지
        int remainder = Calculator.staticRemainderNumber(num1,num2);
        System.out.println("나머지 값은 : " + remainder);
    }
}
