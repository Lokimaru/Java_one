package ru.geekbrains.java_one.homework_5;

public class Cat extends Animal {



    Cat(String name, int runLength, int swimLength, int high) {
        super(name, runLength, swimLength, high);
        this.runLength = RANDOM.nextInt(200) + 100;
        this.swimLength = 0;
        this.high = RANDOM.nextInt( 2) + 2;
    }


    @Override
    public String swim(int s){
        return this.name + " плавать не умеет";
    }

}
