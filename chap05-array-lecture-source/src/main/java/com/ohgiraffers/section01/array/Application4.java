package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계외 평균을 실수로 구하는 프로그램
        * */

        // 점수를 입력 받는다.
        // 입력받은 점수를 scores 배열에 저장
        // 배열에 값들을 합계 int
        // 배열에 값들을 평균 실수

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++ ){

            System.out.print((i + 1) +"번째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();

            sum += scores[i];

        }
        avg = (double)sum/scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);





    }
}
