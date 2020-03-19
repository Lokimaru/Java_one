package ru.geekbrains.java_one.homework_5;

import java.util.Random;

public  class Animal {
    protected String name;
    protected int runLength;
    protected int swimLength;
    protected double high;
    protected Random RANDOM = new Random();

    public String passRun(){
        return this.name + " пробежал";
    }

    public String passSwim(){
        return  this.name + " проплыл";
    }

    public String passJump(){
        return  this.name + " перепрыгул";
    }

    public String fail(){
        return this.name + " не смог";
    }


    public Animal(String name, int runLength, int swimLength, double high) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.high = high;
    }


    public String run(int r) {
        if (r <= runLength && r > 0) {
            return passRun();
        } else {
            return fail();
        }

    }

    public String swim(int s){
        if(s <= swimLength && s > 0){
            return this.name + " проплыл";
        } else {
            return this.name + "не смог проплыть";
        }
    }

    public String jump(int j){
        if(j <= high && j > 0){
            return passJump();
        } else {
            return fail();
        }

    }

}




