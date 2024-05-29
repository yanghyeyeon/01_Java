package com.ohgiraffers.api.split;

public class SplitTest {

    public static void main(String[] args) {

        String char1 = "J a v a P r o g r a m";
        String[] sArry = char1.split(" ");

        for(int i = 0; i < sArry.length; i++) {
            System.out.println("chArry [" + i + "] = " + sArry[i]);
        }

        System.out.println("분리전 글자 = " + char1 + ", 글자 갯수 = " + char1.length());

        System.out.println("분리 후 문자배열 갯수 = " + sArry.length);
        

    }
}
