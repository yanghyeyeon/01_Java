package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Practice {

    public void testStar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = row; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

    public void testStar1() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

    public void testStar2() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int a = 2; a <= i*2; a++){
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

}
