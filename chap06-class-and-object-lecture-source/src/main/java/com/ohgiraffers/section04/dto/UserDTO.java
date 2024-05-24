package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    /*
    * 자바빈(Java Bean)
    * JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스이다.
    * 자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용 할 수 있도록 태그 형식으로 지원하는 문법
    * 이 때, 사용할 수 있도록 규칙을 정해놓은 java 클래스를 자바빈(java bean)이라고 부른다.
    *
    * 지금은. 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 됨.
    * */

    /*
    * 자바빈 작성 규칙
    * 1. 자바빈은 특정 패키지에 속해있어야 함. (default 피키지 사용금지)
    * 2. 멤버변수의 접근제어자는 private으로 선언해야함.
    * 3. 기본 생성자가 명시적으로 존재해야 한다. (매개변수는 선택사항)
    * 4. 모든 멤버 변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야함
    * 5. 직렬화가 되어있어야 한다. (선택사항)
    * */

    // 멤버 변수의 접근제어자는 private으로 선언해야함.
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    // 기본생성자를 명시적으로 작성
    public UserDTO() {}


    // 매개변수 있는 생성자는 선택 사항
    // 매개변수 있는 생성자 중 가장 많이 사용되는것은 모든 필드 초기화 하는 생성자이다.
    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /*
    * 설정자(setter)와 접근자(getter) -> 모든 필드에 대해 만들어야하고 public으로 만들어야함.
    * */

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }


    public String getInfo() {
        return "UserDTO [id" + this.id + ", pwd=" + this.pwd + ", name=" + this.name +
                ", enrolllDate=" + this.enrollDate + "]";
    }
}
