package ru.zhuravlev.homeworks.homework13.transport;


import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Bicycle implements Transport {
    private Human driver;

    public Human getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (areaType == AreaType.SWAMP) {
            System.out.print("По болоту на велосипеде не проехать! ");
            return false;
        }
        if (driver.getStamina() < distance) {
            System.out.print("Сил не хватит на расстояние - " + distance + "! ");
            return false;
        }
        driver.setStamina(driver.getStamina() - distance);
        return true;
    }

    @Override
    public String toString() {
        return "велосипеде";
    }
}
