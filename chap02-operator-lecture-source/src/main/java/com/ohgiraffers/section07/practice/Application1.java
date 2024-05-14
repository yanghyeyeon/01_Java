package com.ohgiraffers.section07.practice;

public class Application1 {

    public static void main(String[] args) {

        // 산술 연산자
        System.out.println("========== 산술 연산자 ==========");

        int a = 15;
        int b = 4;

        int resulte1 = a/b;
        System.out.println("resulte1 = " + resulte1);

        int eight = 8;
        int four = 4;

        int resulte2 = eight % four;
        System.out.println("resulte2 = " + resulte2);

        int c = 5;
        int d = 2;
        int e = 3;

        int resulte3 = c*d-e;
        System.out.println("resulte3 = " + resulte3);

        System.out.println();

        // 복합 대입 연산자
        System.out.println("========== 복합 대입 연산자 ==========");

        int x = 10;
        int resulte4 = x += 5;
        System.out.println("resulte4 = " + resulte4);

        int y = 20;
        int resulte5 = y /= 4;
        System.out.println("resulte5 = " + resulte5);

        int z = 8;
        int resulte6 = z %= 3;
        System.out.println("resulte6 = " + resulte6);
        System.out.println("z의 값은? " + z);

        System.out.println();

        //증감 연산자
        System.out.println("========== 증감 연산자 ==========");

        int i = 0;

        i++;

        System.out.println("i의 값은? " + i);

        int j = 10;

        --j;

        System.out.println("j의 값은? " + j);

        int k = 5;

        k++;

        System.out.println("k의 값은? " + k);

        System.out.println();

        // 비교 연산자
        System.out.println("========== 비교 연산자 ==========");

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1과 num2가 같다 : " + (num1 == num2));
        System.out.println("num1과 num2가 다르다 : " + (num1 != num2));

        System.out.println();

        int num3 = 15;
        int num4 = 10;

        System.out.println("num3이 num4 보다 크다 : " + (num3>num4));
        System.out.println("num3이 num4 보다 크거나 같다 : " + (num3>=num4));
        System.out.println("num3이 num4 보다 작다 : " + (num3<num4));
        System.out.println("num3이 num4 보다 작거나 같다 : " + (num3<=num4));

        System.out.println();

        int age = 5;

        System.out.println("age가 18보다 크다 : " + (age>18));
        System.out.println("age가 18보다 크거나 같다 : " + (age>=18));
        System.out.println("age가 18보다 작다 : " + (age<18));
        System.out.println("age가 18보다 작거나 같다 : " + (age<=18));

        System.out.println();

        // 논리 연산자
        System.out.println("========== 논리 연산자 ==========");

        boolean a1 = true;
        boolean b1 = false;

        System.out.println(a1 && b1);

        int age1 = 20;

        System.out.println("age가 18 이상이고 65 미만이다 : " + (age >=18 && age < 65));

        int x1 = 10;
        int y1 = 20;

        System.out.println("x1이 10이 아니거나 y1이 25이상이다 : " + (x1 != 10 || y1 >= 25));


    }
}
