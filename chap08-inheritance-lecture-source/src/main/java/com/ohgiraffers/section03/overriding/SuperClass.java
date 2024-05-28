package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /*
     * 오버라이딩 이란?
     * 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것
     *
     * 오버라이딩의 성립요건
     * 1. 메소드의 이름이 동일해야 한다.
     * 2. 메소드의 리턴타입이 동일해야한다.
     * 3. 매개변수의 타입, 갯수, 순서가 동일해야한다.
     * 4. private 메서드는 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
     * 5. final 키워드가 사용된 메서드 오버라이딩이 불가능하다 -> final : 변경불가
     * 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
     * 7. 예외처리는 같은 예외이거나 더 구체적인(하위) 예외를 처리해야 한다. -> 예외처리 챕터에서 다룸
     * */

    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}
