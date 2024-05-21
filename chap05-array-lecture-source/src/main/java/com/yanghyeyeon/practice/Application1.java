package com.yanghyeyeon.practice;

public class Application1 {

    public static void main(String[] args) {

        // 배열
        int[] iarr = new int[5];

        int sum = 0;
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr [" + i + "] : " + sum);
            sum += 1;
            iarr[i] = sum;
        }

        // 가변 배열

        int[][] iarr1 = new int[3][];
        int[] iarr2 = new int[]{6,7,8,9};

        iarr1[0] = new int[] {1,2,3};
        iarr1[1] = new int[] {4,5};
        iarr1[2] = iarr2;

        int value = 0;
// 값을 정하지 않고 각 값을 만들어줄때 (1씩 증가)
//        for (int i = 0; i < iarr1.length; i++) {
//            for (int j = 0; j < iarr1[i].length; j++) {
//                iarr1[i][j] = ++value;
//            }
//            System.out.println();
//
//        }
        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.print(iarr1[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();

        // 정변배열
        int[][] iarr3 = new int[3][5];
        for (int i = 0; i < iarr3.length; i++) {
            for (int j = 0; j < iarr3[i].length; j++) {
                System.out.print(iarr3[i][j]);
            }
            System.out.println();

        }

        System.out.println();

        // 미리 할당한 배열을 이용한 방식
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[][] iarr4 = {arr1,arr2};

        for (int i = 0; i < iarr4.length; i++) {
            for (int j = 0; j < iarr4[i].length; j++) {
                System.out.print(iarr4[i][j] + " ");
            }
            System.out.println();

        }
    }
}