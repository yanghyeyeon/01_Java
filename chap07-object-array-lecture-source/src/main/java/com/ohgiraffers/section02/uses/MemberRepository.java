package com.ohgiraffers.section02.uses;

public class MemberRepository {


    // 정보 저장
    private  final static Member[] members;

    private static int count; // 추가되는 인원의 배열의 인덱스 값을 관리하기 위한 변수

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) {

        // 저장을 할 때 앞에서 부터 저장이 되면 안되고, 빈공간에 저장하기 위해 인덱스값에 기록을 남겨놓는 것.
        for(int i= 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }

        return true;
    }

    public static Member[] findAllMembers() {
        // 지금 가지고 있는 멤버만 넘겨줌

        return members;
    }
}
