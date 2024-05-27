package com.yanghyeyeon.subproject;

public class Order {

    private final String menuNAme; // 커피종류
    private final String option; // HOt or ICE
    private final int count; // 수량

    public Order(String menuName, String option, int count) {
        this.menuNAme = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuNAme() {
        return menuNAme;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }


}
