package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public class Horse implements Transport {
    private final String name;
    private int stamina;
    private Human driver;

    public Horse(String name) {
        this.name = name;
        this.stamina = 100;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
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
        if (areaType == AreaType.SWAMP) {
            System.out.print("По болоту на лошади не проехать! ");
            return false;
        }
        if (stamina < distance) {
            System.out.print(name + " устал(а)! ");
            return false;
        }
        stamina -= distance;
        return true;
    }

    @Override
    public String toString() {
        return "лошади";
    }
}
