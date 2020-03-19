package ru.geekbrains.java_one.homework_5;

public class homework_5  {
/*У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 */
    public static void main(String[] args){
        Horse h = new Horse("Буцефал",1500, 100, 3);
        Horse h1 = new Horse("Вихрь",1500, 100, 3);
        Dog d = new Dog("Шарик",500, 10, 0.5);
        Cat c = new Cat("Черныш",200, 0, 2);
        Bird b = new Bird("Арчи",5,0,0.2);

        System.out.println(h.runLength);
        System.out.println(d.high);
        System.out.println(h.run(500));
        System.out.println(c.swim(12));











    }
}
