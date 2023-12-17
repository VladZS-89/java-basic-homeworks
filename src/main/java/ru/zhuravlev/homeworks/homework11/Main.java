package ru.zhuravlev.homeworks.homework11;

import ru.zhuravlev.homeworks.homework11.animals.Cat;
import ru.zhuravlev.homeworks.homework11.animals.Dog;
import ru.zhuravlev.homeworks.homework11.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Жужа", 8, 2);
        Horse horse = new Horse("Плотва", 13, 1);
        Cat cat = new Cat("Феликс", 10);

        dog.info();
        horse.info();
        cat.info();
        System.out.println(" за " + dog.swim(15) + " секунд(ы)");
        System.out.println(" за " + dog.run(20) + " секунд(ы)");
        dog.info();
        System.out.println(" за " + dog.swim(35) + " секунд(ы)");
        dog.info();

        System.out.println(" за " + cat.run(100) + " секунд(ы)");
        cat.swim(100);
        cat.info();

        System.out.println(" за " + horse.swim(20) + " секунд(ы)");
        System.out.println(" за " + horse.run(10) + " секунд(ы)");
        horse.info();
        System.out.println(" за " + horse.swim(10) + " секунд(ы)");
        horse.info();
    }
}
