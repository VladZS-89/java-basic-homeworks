package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Car implements Transport {
    private int petrol;

    private Human driver;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    public Human getDriver() {
        return driver;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (areaType == AreaType.PLAIN && petrol >= distance) {
            petrol -= distance;
            System.out.println("проехал на машине " + distance + " по местности - " + areaType.getArea());
            return true;
        }
        return false;
    }
}
