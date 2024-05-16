package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /*
         * non-static 메서드의 사용방법
         *
         * [클래스명] [사용할이름] = new [클래스명]();
         *
         * 사용
         * [사용할이름].[메소드명]();
         *
         * */

        Calculator calc = new Calculator();
        int min = calc.nonStaticMinNumberOf(first,second);

        System.out.println("두 수 중 최소 값은 : " + min);

        /*
        * static 메서드의 사용방법
        *
        * [클래스명].[매소드명]();
        * */

        int max = Calculator.staticMaxNumberOf(first,second);

        System.out.println("두 수 중 최대 값은 : " + max);

//        int max2 = calc.staticMaxNumberOf(first,second); // 사용할순 있지만 권장되진 않는다.
//
//        System.out.println("두 수 중 최대 값은 : " + max2);

    }
}
