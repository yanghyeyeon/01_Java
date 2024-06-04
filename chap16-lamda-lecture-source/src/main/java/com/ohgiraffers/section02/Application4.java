package com.ohgiraffers.section02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /*
        * Operator : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다
        *            Function과 거의 유사 하지만 다른 점은 매개변수를 이영헤 연산을 한 후
        *            동일한 타입으로 리턴해주는 것이 다르다.
        * */

        /*
        * BinarayOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴한다.
        * */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello","world"));

        /* UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴한다. */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));
    }
}
