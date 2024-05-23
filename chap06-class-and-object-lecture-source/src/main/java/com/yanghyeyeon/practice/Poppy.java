package com.yanghyeyeon.practice;

public class Poppy {

    private String name;
    private int age;
    private String type;

    public void setType(String type) {
        this.type = type;

    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        } else {
            System.out.println("나이는 양수 입니다.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String setInfo() {

        return"강아지의 종류는 " + this.type + "이고, 나이는 " + this.age + "살 이고, 이름은 " + this.name + "입니다.";
    }



}
