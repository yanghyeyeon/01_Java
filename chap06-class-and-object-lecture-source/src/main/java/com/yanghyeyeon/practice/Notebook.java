package com.yanghyeyeon.practice;

public class Notebook {

    private String brand;
    private String model;
    private int ram;
    private int ssd;

//    public Notebook(String brand, String model, int ram, int ssd) {
//        this.brand = brand;
//        this.model = model;
//        this.ram = ram;
//        this.ssd = ssd;
//
//        System.out.println("브랜드는 " + this.brand + "이고, 모델명은 " + this.model + "이며, RAM과 SSD는 각각 " + this.ram + "GB, " + this.ssd + "GB 입니다.");
//    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getInfo() {
        return "브랜드는 " + this.brand + "이고, 모델명은 " + this.model + "이며, RAM과 SSD는 각각 " + this.ram + "GB, " + this.ssd + "GB 입니다.";
    }
}
