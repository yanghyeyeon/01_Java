package com.yanghyeyeon.practice;

public class Application1 {
    public static void main(String[] args) {

        //boolean 자료형이 적응이 잘 안됨
        boolean a = true;
        boolean b = false;

        System.out.println("a와 b의 and : " + (a && b));
        System.out.println("a와 b의 or : " + (a || b));
        System.out.println("a와 b는 같다 : " + (a == b));
        System.out.println("a와 b는 같지않다 : " + (a != b)); // 크기 비교는 할수 없음.

        // 삼항연산자
        int inum1 = 10;
        int inum2 = 20;

        System.out.println();
        System.out.println("inum1이 inum2보다 작으면 inum+2 아니면 inum2-2 : " + ((inum1 < inum2) ? inum1 + 2 : inum2 - 2)); //삼항연산자
        System.out.println("inum1이 inum2보다 크면 inum+2 아니면 inum2-2 : " + ((inum1 > inum2) ? inum1+2 : inum2-2)); //삼항연산자


        //비교연산자 논리연산자

        int a1 = 56;
        int a2 = 77;
        char x1 = 'b';
        char y1 = 'B';

        System.out.println("a1은 1보다 크거나 50보다 작다 : " + (a1 > 1 || a1 < 50 ));
        System.out.println("a1은 1보다 크고 50보다 작다 : " + (a1 > 1 && a1 < 50 ));
        System.out.println("a1은 1부터 60 사이인지 : " + (a1 >= 1 && a1 <= 60));
        System.out.println("x1는 a와 z 사이인지 : " + (x1 > 'a' && x1 <= 'z'));
        System.out.println("y1는 A와 z 사이인지 : " + (y1 > 'A' && y1 <= 'z'));

        System.out.println();
        //증감연산자

        int xy = 10;

        xy += 5;

        System.out.println("xy = " + xy);

        int resulte1 = xy++ * 3;
        System.out.println("resulte1 = " + resulte1);
        System.out.println("xy = " + xy);
        int resulte2 = --xy * 3;
        System.out.println("resulte2 = " + resulte2);
        System.out.println("xy = " + xy);


    }
}
