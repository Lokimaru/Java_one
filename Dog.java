package ru.geekbrains.java_one.homework_5;

public class Dog extends Animal  {
    Dog(String name, int runLength, int swimLength, double high){
        super(name, runLength, swimLength, high);
        this.runLength = RANDOM.nextInt(500) + 150;
        this.swimLength = RANDOM.nextInt(20) + 10;
        this.high = RANDOM.nextInt(2) + 0.5;
    }


}
