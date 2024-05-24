package com.yanghyeyeon.practice;

public class Car {

    private String model;
    private int year;
    private String engine;

    // 매개변수를 이용한 생성자
//    public Car (String model, int year, String engine){
//        this.model = model;
//        this.year = year;
//        this.engine = engine;
//
//    }


    // 메서드를 이용한
    public void setModel (String model) {
        this.model =  model;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }


    public String getInfo() {

        return "자동차 모델명은 " + this.model + "이고, 연식은 " + this.year + "년식 이며, 엔진은 " +
                this.engine +  "입니다.";
    }

}
