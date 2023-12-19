package ru.zhuravlev.homeworks.homework12;

public class Cat {
    private final String name;
    private boolean appetite;

    public Cat(String name) {
        this.name = name;
        this.appetite = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        int eatTillFullAmount = 9;
        if (plate.getCurrentFoodAmount() < eatTillFullAmount) {
            appetite = false;
            System.out.println(name + " остался голодным");
        } else {
            plate.reduceFood(eatTillFullAmount);
            appetite = true;
            System.out.println(name + " наелся.");
        }
    }

    public void info() {
        System.out.println(name + (appetite ? " сытый." : " голодный."));
    }
}
