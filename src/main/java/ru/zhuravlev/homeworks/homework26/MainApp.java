package ru.zhuravlev.homeworks.homework26;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(150));
        apples.add(new Apple(153));
        apples.add(new Apple(141));
        apples.add(new Apple(162));
        apples.add(new Apple(156));
        appleBox.addFruits(apples);
        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        Apple apple = new Apple(149);
        appleBox.addFruit(apple);
        System.out.println("Вес коробки с яблоками: " + appleBox.weight());

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange(200));
        oranges.add(new Orange(222));
        oranges.add(new Orange(233));
        Box<Orange> orangeBox = new Box<>(oranges);
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());
        Orange orange = new Orange(244);

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addFruit(orange);
        fruitBox.addFruit(apple);
        System.out.println("Вес коробки с фруктами: " + fruitBox.weight());
        if (appleBox.compare(fruitBox)) {
            System.out.println("коробки весят одинаково");
        } else {
            System.out.println("вес коробок разный");
        }

        Box<Fruit> newFruitBox = new Box<>();
        Box<Orange> newOrangeBox = new Box<>();
//        appleBox.shift(newOrangeBox); // несоответствие параметров новой коробки
        appleBox.shift(newFruitBox);
        System.out.println("Вес новой коробки с фруктами = " + newFruitBox.weight());
//        fruitBox.shift(newOrangeBox); // несоответствие параметров новой коробки
        fruitBox.shift(newFruitBox);
        System.out.println("Вес новой коробки с фруктами = " + newFruitBox.weight());
    }
}
