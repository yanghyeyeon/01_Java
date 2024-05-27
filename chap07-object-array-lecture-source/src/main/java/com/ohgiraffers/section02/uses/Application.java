package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
        * 여러명의 정보를 받아와서 등록
        * 등록서를 객체 배열로 저장
        * 객체 배열에 저장된값 꺼내서 출력
        * */

        /*
        * 시스템 요구사항
        * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회시 여러명의 회원 정보를 반환
        *
        * 제약사항
        * 1. MemeberRepositor에 ststic 필드로 회원 정보들을 관리한다.
        * 2. 회원 정보는 최대 10명까지 지정할 수 있다.
        * */

        
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("================== 회원 관리 프로그램 ==================");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1: memberService.signUpMembers();
                    break;
                case 2:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력 하셨습니다.");
            }
        }

    }
}
