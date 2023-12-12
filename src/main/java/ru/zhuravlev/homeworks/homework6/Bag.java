package ru.zhuravlev.homeworks.homework6;

import java.util.Arrays;

public class Bag {
    String[] things = new String[5];

    public void add(String thing) {
        for (int i = 0; i < things.length; i++) {
            if (things[i] == null) {
                things[i] = thing;
                System.out.println("Положим в пустое место "  + thing);
                return;
            }
        }
    }

    public void contains(String thing) {

        for (String s : things) {
            if (s.equalsIgnoreCase(thing)) {
                System.out.println("Предмет " + thing + " найден");
                return;
            }
        }
        System.out.println("Предмет " + thing + " не найден");
    }

    public void count(String thing) {
        int count = 0;
        for (String s : things) {
            if (s != null && s.equalsIgnoreCase(thing)) {
                count++;
            }
        }
        System.out.println(thing + " в рюкзаке лежит в количестве " + count + "шт.");
    }

    public void clear() {
        for (String thing : things) {
            if (thing != null) {
                System.out.println("Выбросили: " + thing);
            }
        }
        Arrays.fill(things, null);
    }

    public void info() {
        System.out.println("В сумке:");
        for (String thing : things) {
            System.out.println(thing);
        }
    }
}
