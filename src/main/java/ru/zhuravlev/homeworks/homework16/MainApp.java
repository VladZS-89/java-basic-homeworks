package ru.zhuravlev.homeworks.homework16;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Журавлев Владислав", 84957773322L);
        System.out.println(phoneBook.find("Журавлев Владислав "));
        phoneBook.add(" Журавлев Владислав ", 84957773322L);
        phoneBook.add("  Журавлев Владислав  ", 84959998877L);
        phoneBook.add("Кузьмин Сергей  ", 84951115599L);
        System.out.println(phoneBook.find("журавлев владислав"));
        if (phoneBook.containsPhoneNumber(84959998877L)) {
            System.out.println("Телефон есть в справочнике");
        } else {
            System.out.println("Телефон отсутствует в справочнике");
        }
    }
}
