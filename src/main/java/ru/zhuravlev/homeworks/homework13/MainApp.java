package ru.zhuravlev.homeworks.homework13;

import ru.zhuravlev.homeworks.homework13.transport.Bicycle;
import ru.zhuravlev.homeworks.homework13.transport.Car;
import ru.zhuravlev.homeworks.homework13.transport.Horse;
import ru.zhuravlev.homeworks.homework13.transport.Rover;

public class MainApp {
    public static void main(String[] args) {
        Human oleg = new Human("Олег");

        Bicycle bike = new Bicycle();
        Horse horse = new Horse("Плотва");
        Car gelik = new Car(100);
        Rover vezdehod = new Rover(100);

        oleg.move(30, AreaType.PLAIN);
        oleg.move(30, AreaType.FOREST);
        oleg.move(10, AreaType.SWAMP);
        oleg.getOnTransport(bike);
        oleg.move(30, AreaType.PLAIN);
        oleg.move(30, AreaType.FOREST);
        oleg.move(30, AreaType.SWAMP);
        oleg.getOffTransport();
        oleg.getOnTransport(horse);
        oleg.move(30, AreaType.PLAIN);
        oleg.move(30, AreaType.FOREST);
        oleg.move(30, AreaType.SWAMP);
        oleg.move(100, AreaType.FOREST);
        oleg.getOffTransport();
        oleg.getOnTransport(gelik);
        oleg.move(30, AreaType.FOREST);
        oleg.move(30, AreaType.SWAMP);
        oleg.move(30, AreaType.PLAIN);
        oleg.move(100, AreaType.PLAIN);
        oleg.getOffTransport();
        oleg.getOnTransport(vezdehod);
        oleg.move(30, AreaType.FOREST);
        oleg.move(30, AreaType.SWAMP);
        oleg.move(100, AreaType.PLAIN);
        oleg.getOffTransport();
    }
}
