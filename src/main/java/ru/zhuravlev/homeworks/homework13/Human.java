package ru.zhuravlev.homeworks.homework13;

import ru.zhuravlev.homeworks.homework13.transport.*;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int stamina;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
        this.stamina = 100;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void move(int distance, AreaType areaType) {
        if (currentTransport == null && stamina >= distance) {
            stamina -= distance;
            System.out.println(name + " прошёл пешком расстояние - " + distance + ", по местности - " + areaType.getArea());
        } else if (currentTransport == null) {
            System.out.println(name + " не осилил расстояние - " + distance);
        } else {
            System.out.print(name + " " + currentTransport.move(distance, areaType));
        }
    }

    public void getOnTransport(Transport transport) {
        if (currentTransport == null) {
            if (transport.getClass() == Bicycle.class) {
                ((Bicycle) transport).setDriver(this);
            }
            currentTransport = transport;
        } else {
            System.out.println(name + " сначала должен спешиться!");
        }
    }

    public void getOffTransport() {
        currentTransport = null;
        System.out.println(name + " спешился.");
    }
}
