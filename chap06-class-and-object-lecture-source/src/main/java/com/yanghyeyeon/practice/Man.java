package com.yanghyeyeon.practice;

public class Man {

    private int age;
    private String name;
    private char gender;
    private boolean isMarried ;
    private int kids;


//    public Man(int age, String name, char gender, boolean isMariied, int kids) {
//        this.age = age;
//        this.name = name;
//        this.gender = gender;
//        this.isMarried = true;
//        this.kids = kids;
//
//        System.out.println("남자의 이름은 " + this.name + "이고, 나이는 " + this.age + "살 이며, 성별은 '" + this.gender + "' 이고, 결혼 여부는 " + this.isMarried + "이며, 자식의 수는 " +
//                this.kids + "명 입니다.");
//    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getInfo() {

        return "남자의 이름은 " + this.name + "이고, 나이는 " + this.age + "살 이며, 성별은 '" + this.gender + "' 이고, 결혼 여부는 " + this.isMarried + "이며, 자식의 수는 " + this.kids + "명 입니다.";
    }
}
