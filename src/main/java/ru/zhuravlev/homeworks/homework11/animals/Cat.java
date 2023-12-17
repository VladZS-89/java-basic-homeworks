package ru.zhuravlev.homeworks.homework11.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun) {
        super(name, speedRun, 0);
    }

    @Override
    public double swim(int distance) {
        System.out.println("кот не умеет плавать");
        return -1;
    }

    @Override
    public void info() {
        System.out.println("У кота по кличке " + name
                + " осталось выносливости " + stamina + " из 100.");
    }
}
