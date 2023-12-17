package ru.zhuravlev.homeworks.homework11.animals;

public abstract class Animal {
    protected final String name;
    protected final int speedRun;
    protected final int speedSwim;
    protected int stamina;

    public Animal(String name, int speedRun, int speedSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = 100;
    }

    public String getName() {
        return name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
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
            System.out.println(name + " устал(а) и не может пробежать " + distance + " метров");
            return -1;
        } else {
            stamina = (stamina - distance);
            System.out.print(name + " пробежал(а) " + distance + " метров");
            return Math.round((double) distance / speedRun);
        }
    }

    public abstract double swim(int distance);

    public abstract void info();
}
