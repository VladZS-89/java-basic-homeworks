package ru.zhuravlev.homeworks.homework11.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim) {
        super(name, speedRun, speedSwim);
    }

    @Override
    public double swim(int distance) {
        if (stamina < distance * 4) {
            stamina = 0;
            System.out.println(name + " устал(а) и не может проплыть " + distance + " метров");
            return -1;
        } else {
            stamina = stamina - (distance * 4);
            System.out.print(name + " проплыл(а) " + distance + " метров");
            return Math.round((double) distance / speedSwim);
        }
    }

    @Override
    public void info() {
        System.out.println("У лошади по кличке " + name
                + " осталось выносливости " + stamina + " из 100.");
    }
}
