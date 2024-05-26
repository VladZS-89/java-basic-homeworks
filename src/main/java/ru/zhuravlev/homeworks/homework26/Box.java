package ru.zhuravlev.homeworks.homework26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
        fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruits(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public int weight() {
        int sumWeight = 0;
        for (T f: fruits) {
            sumWeight += f.getWeight();
        }
        return sumWeight;
    }

    public boolean compare(Box<?> box) {
        return this.weight() == box.weight();
    }

    public void shift(Box<? super T> targetBox) {
        if (targetBox == this) {
            return;
        }
        targetBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
