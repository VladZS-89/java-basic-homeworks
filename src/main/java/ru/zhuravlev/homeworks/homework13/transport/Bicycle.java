package ru.zhuravlev.homeworks.homework13.transport;


import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Bicycle implements Transport {
    private Human driver;

    public Human getDriver() {
        return driver;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (driver.getStamina() >= distance && areaType != AreaType.SWAMP) {
            driver.setStamina(driver.getStamina() - distance);
            System.out.println("проехал на велосипеде " + distance + " по местности - " + areaType.getArea());
            return true;
        }
        return false;
    }
}
