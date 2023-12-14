package ru.zhuravlev.homeworks.homework11.animals;

import ru.zhuravlev.homeworks.homework11.Main;

public abstract class Animal {
    private final String name;
    private final int speedRun;
    private int stamina;

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
            System.out.println(getName() + " устал(а)");
            return -1;
        } else {
            setStamina(getStamina() - distance);
            System.out.print(name + " пробежал(а) " + distance + " метров");
            return Math.round((double) distance / getSpeedRun());
        }
    }

    public abstract void info();
}
