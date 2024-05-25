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

//        Car car = new Car("Tesla Model S", 2022, "전기차");
//        System.out.println(car.getInfo());

        Car car1 = new Car();
        car1.setModel("Tesla Model S");
        car1.setYear(2022);
        car1.setEngine("전기차");
        System.out.println(car1.getInfo());

//        Man man = new Man(30,"James",'남',true, 3);

        Man man1 = new Man();

        man1.setName("James");
        man1.setAge(30);
        man1.setGender('남');
        man1.setMarried(true);
        man1.setKids(3);
        System.out.println(man1.getInfo());

//        Notebook notebook = new Notebook("Dell","XPS 13", 16,512);

        Notebook notebook1 = new Notebook();

        notebook1.setBrand("Dell");
        notebook1.setModel("XPS 13");
        notebook1.setRam(16);
        notebook1.setSsd(512);

        System.out.println(notebook1.getInfo());


    }
}
