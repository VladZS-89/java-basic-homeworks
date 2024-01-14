package ru.zhuravlev.homeworks.homework12;

public class Plate {
    private final int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public int getMaxFoodAmount() {
        return maxFoodAmount;
    }

    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public void addFood(int foodAmount) {
        System.out.println("Докладываем в тарелку " + foodAmount + " еды");
        if (currentFoodAmount + foodAmount > maxFoodAmount) {
            System.out.println("Тарелка полна. Лишние " + (currentFoodAmount + foodAmount - maxFoodAmount) + " еды");
            currentFoodAmount = maxFoodAmount;
        } else {
            currentFoodAmount += foodAmount;
        }
    }

    public boolean reduceFood(int foodAmount) {
        if (currentFoodAmount - foodAmount < 0) {
            return false;
        } else {
            currentFoodAmount -= foodAmount;
            return true;
        }
    }

    public void info() {
        System.out.println("В тарелке " + currentFoodAmount + " еды.");
    }
}
