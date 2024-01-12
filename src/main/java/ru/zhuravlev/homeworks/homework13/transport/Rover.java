package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Rover implements Transport {
    private int petrol;
    private Human driver;

    public Human getDriver() {
        return driver;
    }

    public Rover(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (petrol >= distance) {
            petrol -= distance;
            System.out.println("проехал на вездеходе " + distance + " по местности - " + areaType.getArea());
            return true;
        }
        return false;
    }
}
