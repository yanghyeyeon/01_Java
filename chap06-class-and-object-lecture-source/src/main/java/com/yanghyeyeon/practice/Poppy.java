package com.yanghyeyeon.practice;

public class Poppy {

    private String name;
    private int age;
    private String kinds;

    public void setKinds(String kinds) {
        this.kinds = kinds;

    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age); // 절대값
        }
    }

    public void setName(String name) {

        this.name = name;
    }
    public String getInfo() {

        return "강아지의 종은 " + this.kinds + "이고, 나이는 " + this.age + "살 이며, 이름은 " + this.name + "입니다.";
    }



}
