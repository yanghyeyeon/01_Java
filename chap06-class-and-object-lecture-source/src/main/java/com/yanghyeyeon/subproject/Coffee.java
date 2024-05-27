package com.yanghyeyeon.subproject;

public class Coffee {

    // 커피종류 [아메리카노, 라떼]
    private final String coffeeName;
    // 옵션 [HOT/ICE]
    private final String option;

    public Coffee(String coffeeName, String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    // toString : 필드에 있는 모든걸 출력하고 싶을 때 만드는 메서드
    public String toString() {
        return "%s(%s)".formatted(coffeeName,option);
    }
}
