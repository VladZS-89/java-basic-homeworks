package ru.zhuravlev.homeworks.homework3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int x = scanner.nextInt();
        if (x == 1) {
            greetings();
        } else if (x == 2) {
            checkSign(rndInt(), rndInt(), rndInt());
        } else if (x == 3) {
            selectColor();
        } else if (x == 4) {
            compareNumbers();
        } else if (x == 5) {
            addOrSubtractAndPrint(rndInt(), rndInt(), true);
        } else {
            System.out.println("Число " + x + " не входит в диапозон от 1 до 5");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int)(Math.random() * 100);
        System.out.print(data + " - ");
        if (data <= 10) {
            System.out.println("Красный");
        } else if (10 < data && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10, b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static Integer rndInt() {
        return (int)(Math.random() * 1000) - 500;
    }
}
