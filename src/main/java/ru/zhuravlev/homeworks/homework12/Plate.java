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
        currentFoodAmount += foodAmount;
        int ExtraFood = maxFoodAmount - currentFoodAmount;
        if (ExtraFood < 0) {
            currentFoodAmount = maxFoodAmount;
            System.out.println("Тарелка полна. Лишние " + (ExtraFood * -1) + " еды");
        }
    }

    public boolean reduceFood(int foodAmount) {
        currentFoodAmount -= foodAmount;
        if (currentFoodAmount < 0) {
            currentFoodAmount = 0;
            return false;
        } else {
            return true;
        }
    }

    public void info() {
        System.out.println("В тарелке " + currentFoodAmount + " еды.");
    }
}
