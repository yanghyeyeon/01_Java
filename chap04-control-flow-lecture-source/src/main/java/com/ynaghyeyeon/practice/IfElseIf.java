package com.ynaghyeyeon.practice;

import java.util.Scanner;

public class IfElseIf {

    public void testIfElseif () {

        System.out.println("=== Ohgiraffers bending machine ===");
        System.out.println(" 1.사이다  2.콜라  3.환타  4.박카스  5.핫식스 ");
        System.out.println("==============================");
        System.out.println("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        int selectedDrink = sc.nextInt();

        int price = 0;

        if (selectedDrink == 1) {
            System.out.println("사이다를 선택하셨습니다.");
            price = 500;
        } else if (selectedDrink == 2) {
            System.out.println("콜라를 선택하셨습니다.");
            price = 600;
        } else if (selectedDrink == 3) {
            System.out.println("환타를 선택하셨습니다.");
            price = 700;
        } else if (selectedDrink == 4) {
            System.out.println("박카스를 선택하셨습니다.");
            price = 800;
        } else if (selectedDrink == 5) {
            System.out.println("핫식스를 선택하셨습니다.");
            price = 900;
        } else {
            System.out.println("자판기에 없는 물품 입니다.");
        }

        System.out.println(price + "원을 투입주세요");
    }
}
