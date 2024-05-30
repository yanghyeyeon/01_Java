package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] firstSplit = data.split("\\|");

        System.out.println(firstSplit.length);
        System.out.println(Arrays.toString(firstSplit));

        Member[] members = new Member[firstSplit.length];

        for( int i = 0; i < firstSplit.length; i++) {

            String[] secondSplit = firstSplit[i].split(",");

            Member member = new Member();
            member.setMemberName(secondSplit[1]);
            member.setMemberNo(Integer.parseInt(secondSplit[0]));
            member.setHeight(Integer.parseInt(secondSplit[2]));
            member.setWeight(Integer.parseInt(secondSplit[3]));
            LocalDate birth = LocalDate.parse(secondSplit[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirth(birth);

            members[i] = member;
        }

        System.out.println(Arrays.toString(members));







    }
}
