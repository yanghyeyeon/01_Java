package com.yanghyeyeon.section1.literal;

public class Application1 {
    public static void main(String[] args){
        /*System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");

        System.out.println("편해요 ㅎㅎ");
        System.out.println();
        */

        // 수업목표 : 여러 가진 값의 형태를 출력 할 수 있다.

        //정수 출력
        System.out.println(123);
        //실수 출력
        System.out.println(12.3);

        //문자 출력
        System.out.println('a'); //문자 형태의 값을 홀따옴표로 감싸주어야 한다.
        //System.out.println('ab'); 문자열이기 때문에 오류가 난다

        System.out.println('1'); //숫자 값이지만 홀다옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
        //System.out.println(''); 문자는 빈값을 허용하지 않는다.

        //문자열 출력
        System.out.println("안녕하세요"); //문자열은 문자가 여러개가 나열 된 형태를 의미하며 쌍따옴표로 감싸져있다.
        System.out.println("123"); //필기 : 정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); //아무 값도 없는 빈쌍따옴표도 문자열로 취급 된다.
        System.out.println("a"); //한개의 문자도 쌍따옴표로 감싸면 문자열이다 (문자 'a' 랑은 달라요)

        //논리값 출력

        System.out.println(true);
        System.out.println(false);




    }
}
