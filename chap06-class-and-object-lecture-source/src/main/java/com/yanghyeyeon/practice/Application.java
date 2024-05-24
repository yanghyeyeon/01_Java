package com.yanghyeyeon.practice;

public class Application {
    public static void main(String[] args) {

        Poppy poppy = new Poppy();

        poppy.setAge(5);
        poppy.setKinds("골든 리트리버");
        poppy.setName("Max");

        System.out.println(poppy.getInfo());


        Book book = new Book();

        book.setWriter("Joshua Bloch");
        book.setName("Effective Java");
        book.setPage(416);
        book.setCover("하드 커버");

        System.out.println(book.getInfo());


    }
}
