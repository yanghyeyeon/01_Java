package com.yanghyeyeon.subproject;

import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);

    // 메뉴
    public void menu() {

        // 쌍 따옴표 3개가 되면 여러줄을 포함 할 수 있게된다.
        String menu = """
                ====================
                  커피 주문 프로그램
                ====================
                1. 아메리카노
                2. 라떼
                3. 종료
                ====================
                선택 : """;

        while (true) {
            System.out.print(menu);

            Order order = null;
            String choice = sc.next();

            switch (choice) {

                case "1":
                    order = createOrder("아메리카노");
                    break;

            }
        }
    }

    private Order createOrder(String menuName) {

        // 옵션
        String option = inputOption();
        // 수량
        int count = inputCount();

        Order order = new Order(menuName,option,count);

        // 주문 확인
        boolean confirmed = confirmedOrder(order);

        return confirmed ? order : null;
    }

    private boolean confirmedOrder(Order order) {

        System.out.print("""
                > 주문 내역을 확인하세요
                ------------------------
                메뉴명 :
                옵션 :
                수량 :
                ------------------------
                > 주문처리 1.승인 2.취소
                입력 : """.formatted(order.getMenuNAme(),order.getCount(),order.getOption()));
    }

    // 사용자한테 수량을 입력 받는 기능
    private int inputCount() {

        System.out.print("> 수량을 입력하세요 :");

        return sc.nextInt();
    }

    //사용자한테 입력받아 HOT, ICE를 return 해주는 기능
    private String inputOption() {
        System.out.print("> 옵션을 선택하세요. 1. HOT, 2. ICE");

        //if
//        String input = sc.next();
//        String result = "";
//        if(input.equals("1")) {
//
//            result = "HOT";
//        } else {
//            result = "ICE";
//        }
//        return result;

        return sc.next().equals("1") ? "HOT" : "ICE";
    }

}
