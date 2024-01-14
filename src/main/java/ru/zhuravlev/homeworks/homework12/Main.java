package ru.zhuravlev.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = {
                new Cat("Салем"),
                new Cat("Орион"),
                new Cat("Джонси"),
                new Cat("Лаки"),
                new Cat("Гарфилд"),
                new Cat("Черч")
        };

        for (Cat cat : cats) {
            cat.info();
        }
        System.out.println("=================");
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println("=================");
        plate.info();
        plate.addFood(10);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.isAppetite()) {
                cat.eat(plate);
            }
        }
        plate.addFood(100);
    }
}
