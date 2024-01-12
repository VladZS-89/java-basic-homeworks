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

    public Human getDriver() {
        return driver;
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

    @Override
    public boolean move(int distance, AreaType areaType) {
        if (stamina >= distance && areaType != AreaType.SWAMP) {
            stamina -= distance;
            System.out.println("проскакал на лошади по кличке " + name +
                    " расстояние - " + distance + " по местности - " + areaType.getArea());
            return true;
        }
        return true;
    }
}
