package com.yanghyeyeon.practice;

public class Application {
    public static void main(String[] args) {

        Poppy poppy = new Poppy();

        poppy.setAge(5);
        poppy.setType("골든 리트리버");
        poppy.setName("Max");

        System.out.println(poppy.setInfo());


        Book book = new Book();

        book.setName("Effective Java");
        book.setPage(416);
        book.setCover("하드 커버");

        System.out.println(book.setInfo());
    }
}
