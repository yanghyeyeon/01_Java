package com.ohgiraffers.section01.init;

public class Car {

    // 모델 이름
    private  String modelName;
    // 최고 속력
    protected int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 필드값 출력 메서드
    public void dirveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed +
                "km/h 로 달려갑니다.");
    }
}
