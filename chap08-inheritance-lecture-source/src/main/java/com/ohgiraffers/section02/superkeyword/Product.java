package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {

    private String cod;                 // 상품코드
    private String brand;               // 제조사
    private String name;                // 상품명
    private int price;                  // 가격
    private Date ManufacturingDate;     // 제조일자

    public Product() {
        System.out.println("Product 클래시의 기본생성자 호출함");
    }

    public Product(String cod, String brand, String name, int price, Date manufacturingDate) {

        super();
        this.cod = cod;
        this.brand = brand;
        this.name = name;
        this.price = price;
        ManufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");
    }
}
