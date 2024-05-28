package com.ohgiraffers.section04.use3;

public class SuperDice implements Dice{

    private int min;
    private int max;

    public SuperDice() {
        this.min = 1;
        this.max = 10;
    }

    @Override
    public int getNumber() {

        return (int)(Math.random() * max ) + min;
    }
}
