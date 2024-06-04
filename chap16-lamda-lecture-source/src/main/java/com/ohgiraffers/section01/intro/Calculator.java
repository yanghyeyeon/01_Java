package com.ohgiraffers.section01.intro;

/*
* 자바에서는 메소드를 독립적으로 선언하는 것이 불가능
* -> 클래스나 인터페이스 내부에서만 선언되기 대문에 메소드를 가지는 클래스나 인터페이스가 필요
* 람다식은 이 중 니터페이스를 사용할 수 있다.
* 모든 인터페이스에 메소드를 작성한다고 람다식을 활용 가능한것은 아니다.
* 인터페이스 내부에 하나의 추상메소드가 선언된 인터페이스만 람다식으로 사용 가능하다.
* 이런 인터페이스를 함수적 인터페이스(functional interface)라고 한다.
* */

// 인터페이스가 함수적 인터페이스인지 확인해주는 기능
@FunctionalInterface
public interface Calculator {

    public int sumTwoNumbers(int a, int b);

    //public int multipleTwoNumbers(int a, int b);
}
