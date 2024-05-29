package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {

        String first = s.substring(0,1);
        String upper = first.toUpperCase();
        String remain = s.substring(1);

        return upper.concat(remain);

    }

    public int charSu(String s, char ch) {

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            // charAt(i) 사용
            // 같은 문자 발견할 때마다 num++;
            if(s.charAt(i) == ch) {
                num++;
            }
        }

        return num;
    }


}
