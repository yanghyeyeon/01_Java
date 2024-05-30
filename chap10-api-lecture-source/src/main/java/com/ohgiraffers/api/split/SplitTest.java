package com.ohgiraffers.api.split;

import java.util.Arrays;

public class SplitTest {

    public static void main(String[] args) {

        String str1 = "J a v a P r o g r a m";
        String[] sArry = str1.split(" ");

        char[] chArry = new char[sArry.length];

        for(int i = 0; i < sArry.length; i++) {
           chArry[i] = sArry[i].charAt(0);

        }
        System.out.println(Arrays.toString(chArry));

        System.out.println("분리전 글자 = " + str1 + ", 글자 갯수 = " + str1.length());

        System.out.println("분리 후 문자배열 갯수 = " + chArry.length);

        String str2 = String.valueOf(chArry);
        str2 = str2.toUpperCase();
        System.out.println(str2);


    }
}
