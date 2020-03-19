package ru.geekbrains.java_one.homework_5;

public class Horse extends Animal  {

    Horse(String name, int runLength, int swimLength, double high){
        super(name, runLength, swimLength, high);
        this.runLength = RANDOM.nextInt(1500) + 300;
        this.swimLength = RANDOM.nextInt(100) + 20;
        this.high = RANDOM.nextInt(2) + 3;
    }

}
