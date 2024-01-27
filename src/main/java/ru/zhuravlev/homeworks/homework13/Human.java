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
        String distAndArea = " расстояние - " + distance + ", по локации - " + areaType.getArea();
        if (currentTransport == null) {
            if (stamina >= distance) {
                stamina -= distance;
                System.out.println(name + " прошёл пешком" + distAndArea);
            } else {
                System.out.println(name + " не осилил расстояние - " + distance);
            }
            return;
        }
        if (currentTransport.move(distance, areaType)) {
            System.out.println(name + " проехал на " + currentTransport + distAndArea);
        } else {
            System.out.println(name + " не смог проехать на " + currentTransport + distAndArea);
        }
    }

    public void getOnTransport(Transport transport) {
        if (currentTransport == null) {
            transport.setDriver(this);
            currentTransport = transport;
            System.out.println(name + " на " + currentTransport + ".");
        } else {
            System.out.println(name + " сначала должен спешиться!");
        }
    }

    public void getOffTransport() {
        currentTransport = null;
        System.out.println(name + " спешился.");
    }
}
