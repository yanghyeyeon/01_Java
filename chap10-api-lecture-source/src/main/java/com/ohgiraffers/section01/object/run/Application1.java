package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {
    // Object 클래스의 toString
    public static void main(String[] args) {

        /*
         * Object
         *
         * 모든 클래스는 Object 클래스의 후손이다.
         * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용 할 수 있다.
         * 또한 부모클래스가 가지는 메소드를 오버라이딩 하여 사용하는것도 가능하다.
         *
         * Object 클래스의 메소드 중 많이 오버라이딩해서 사용하는 메소드들
         * toString(), equals(), hashCode()
         * */

        Book book1 = new Book(1, "홍길동전","허균",50000);
        Book book2 = new Book(2, "목민심서","정약용",30000);
        Book book3 = new Book(3, "목민심서","정약용",30000);

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());

        System.out.println("================== toString 오버라이딩 이후 ==================");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);

    }
}
