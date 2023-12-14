package ru.zhuravlev.homeworks.homework11.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun) {
        super(name, speedRun);
    }

    @Override
    public void info() {
        System.out.println("У кота" + " по кличке " + getName()
                + " осталось выносливости " + getStamina() + " из 100.");
    }
}
