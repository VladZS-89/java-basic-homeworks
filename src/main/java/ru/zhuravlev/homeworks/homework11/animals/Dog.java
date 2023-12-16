package ru.zhuravlev.homeworks.homework11.animals;

public class Dog extends Animal {
    private final int speedSwim;

    public Dog(String name, int speedRun, int speedSwim) {
        super(name, speedRun);
        this.speedSwim = speedSwim;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public double swim(int distance) {
        if (stamina < distance * 2) {
            stamina = 0;
            System.out.println(name + " устал(а) и не может проплыть " + distance + " метров");
            return -1;
        } else {
            stamina = stamina - (distance * 2);
            System.out.print(name + " проплыл(а) " + distance + " метров");
            return Math.round((double) distance / speedSwim);
        }
    }

    @Override
    public void info() {
        System.out.println("У собаки по кличке " + name
                + " осталось выносливости " + stamina + " из 100.");
    }
}
