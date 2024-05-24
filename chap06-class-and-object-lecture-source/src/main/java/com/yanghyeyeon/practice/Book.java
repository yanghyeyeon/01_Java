package com.yanghyeyeon.practice;

public class Book {

    private String writer;
    private String name;
    private int page;
    private String cover;

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPage(int page) {
        if (page > 0) {
            this.page = page;
        } else {
            System.out.println("페이지를 잘 못 적으셨습니다.");
        }
    }

    public void setCover(String cover) {
        this.cover = cover;

    }

    public String getInfo() {
        return"책의 이름은 " + this.name + "이고, 페이지는 " + this.page + "이고, 커버 종류는 " + this.cover + "입니다";
    }
}

