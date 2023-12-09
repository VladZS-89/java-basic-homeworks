package ru.zhuravlev.homeworks.homework4;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что хотите протестировать (выберите цифру):\n1 - Калькулятор\n2 - простую игру в числа\n3 - сложную игру в числа");
            int choice = scanner.nextInt();
            if (choice == 1) {
                simpleCalculator();
                break;
            } else if (choice == 2) {
                simpleNumbersGame();
                break;
            } else if (choice == 3) {
                hardNumbersGame();
                break;
            } else {
                System.out.println("Введите число от 1 до 3");
            }
        }
    }

    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float a = scanner.nextInt();
        System.out.println("Введите операцию: +, -, *, /");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        float b = scanner.nextInt();
        float result;

        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            result = a / b;
        } else {
            System.out.println("Попытка выполнить неизвестную операцию.");
            return;
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }

    public static void hardNumbersGame() {
        Scanner scanner = new Scanner(System.in);
        int tries;
        int interval;
        System.out.println("Введите сложность от 1 до 3");
        int difficult = scanner.nextInt();
        if (difficult == 1) {
            tries = 3;
            interval = 5;
        } else if (difficult == 2) {
            tries = 2;
            interval = 10;
        } else {
            System.out.println("Это HARD MODE, страдай!!!");
            tries = 1;
            interval = 100;
        }

        int rndNumber = (int) (Math.random() * interval) + 1;
        System.out.println("Компьютер загадал число от 1 до " + interval);
        while (true) {
            System.out.println("Попробуйте отгадать число. Попыток: " + tries);
            int answer = scanner.nextInt();
            if (answer == rndNumber) {
                System.out.println("Вы победили!");
                break;
            }
            tries--;
            if (tries == 0) {
                System.out.println("Попытки потрачены. Вы проиграли.");
                break;
            }
            if (answer < rndNumber) {
                System.out.println("Не отгадали. Загаданное число больше.");
            } else {
                System.out.println("Не отгадали. Загаданное число меньше.");
            }

        }
        System.out.println("GAME OVER!!!");
    }

    public static void simpleNumbersGame() {
        Scanner scanner = new Scanner(System.in);
        int rndNumber = (int) (Math.random() * 10);
        System.out.println("Угадайте число от 0 до 10");
        int myNumber = scanner.nextInt();
        if (myNumber == rndNumber) {
            System.out.println("Вы победили");
        } else {
            System.out.println("Вы проиграли, правильный ответ - " + rndNumber);
        }
    }

    public static void getHardNumberInInterval(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите число от " + min + " до " + max);
        while (true) {
            n = scanner.nextInt();
            if (n >= min && n <= max) {
                break;
            }
            System.out.println("Вы неправы");
        }
        System.out.println("Вы ввели число " + n);
    }

    public static void getNumberInInterval(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите число от " + min + " до " + max);
            n = scanner.nextInt();
        } while (n < min || n > max);
        System.out.println("Вы ввели число " + n);
    }
}
