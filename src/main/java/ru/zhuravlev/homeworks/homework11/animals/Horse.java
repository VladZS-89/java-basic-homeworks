package ru.zhuravlev.homeworks.homework11.animals;

public class Horse extends Animal {
    private final int speedSwim;

    public Horse(String name, int speedRun, int speedSwim) {
        super(name, speedRun);
        this.speedSwim = speedSwim;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public double swim(int distance) {
        if (getStamina() < distance * 4) {
            setStamina(0);
            System.out.println(getName() + " устал(а) и не может проплыть " + distance + " метров");
            return -1;
        } else {
            setStamina(getStamina() - (distance * 4));
            System.out.print(getName() + " проплыл(а) " + distance + " метров");
        }
        return Math.round((double) distance / getSpeedSwim());
    }

    @Override
    public void info() {
        System.out.println("У лошади" + " по кличке " + getName()
                + " осталось выносливости " + getStamina() + " из 100.");
    }
}
