package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Car implements Transport {
    private int petrol;
    private Human driver;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public Human getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (areaType == AreaType.SWAMP || areaType == AreaType.FOREST) {
            System.out.print("Машина ни по болоту ни по лесу не проедет! ");
            return false;
        }
        if (petrol < distance) {
            System.out.print("Бензина не хватит на расстояние - " + distance + "! ");
            return false;
        }
        petrol -= distance;
        return true;
    }

    @Override
    public String toString() {
        return "машине";
    }
}
