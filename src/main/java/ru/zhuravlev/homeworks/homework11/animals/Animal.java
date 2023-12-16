package ru.zhuravlev.homeworks.homework11.animals;

import ru.zhuravlev.homeworks.homework11.Main;

public abstract class Animal {
    protected final String name;
    protected final int speedRun;
    protected int stamina;

    public Animal(String name, int speedRun) {
        this.name = name;
        this.speedRun = speedRun;
        this.stamina = 100;
    }

    public String getName() {
        return name;
    }

    public int getSpeedRun() {
        return speedRun;
    }


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }


    public double run(int distance) {
        if (stamina < distance) {
            stamina = 0;
            System.out.println(name + " устал(а)");
            return -1;
        } else {
            stamina = (stamina - distance);
            System.out.print(name + " пробежал(а) " + distance + " метров");
            return Math.round((double) distance / speedRun);
        }
    }

    public abstract void info();
}
