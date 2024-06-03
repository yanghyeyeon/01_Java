package com.ohgiraffers.section03.grammar;

public enum UserRole2 {
    // 각각의 요소들이 특정한 값을 가지게 할 수 있다.
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    /*
    * 이러한 경우 매개변수 있는 생성자가 반드시 필요하낟.
    * Enum 상수의 괄호 안에 넣은 값이 해당 생성자쪽으로 전달되며,
    * Enum 인스턴스가 생성된다. 생성된 인스턴스는 싱글톤 객체이다.
    * */
    UserRole2(String description) {

        System.out.println("description : " + description);

        this.description = description;
    }

    // 요소들이 가지는 기본 네임과 정수값 이외의 값을 외부에서 사용하려 할때
    // 필드로 작성한 값을 반환하도록 할 수 있다.
    public String getDescription() {
        return this.description;
    }
}
