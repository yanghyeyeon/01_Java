package com.ohgiraffers.api.split;

import java.util.Arrays;

public class SplitTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";

        // 문자열 분리
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        // 문자 배열로 바꾸기
        // 1) 문자배열을 문자열배열 크기로 만들기
        char[] chArr = new char[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
                
        }

//        for (String s : strArr) {
//            System.out.println(s);
//        }
    }
}
