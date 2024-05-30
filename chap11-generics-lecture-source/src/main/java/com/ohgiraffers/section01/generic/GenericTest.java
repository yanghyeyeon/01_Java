package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    /*
    * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
    * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성된다.
    * */

    private T value; // 타입이 결정 X

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
