package ru.zhuravlev.homeworks.homework06;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

//        gameGuessWord();

//        gameFieldMiracles();

        bagDemo();
    }

    public static void bagDemo() {
        Bag bag = new Bag();
        bag.info();
        bag.add("ноут");
        bag.add("мышь");
        bag.add("зарядка");
        bag.info();
        bag.contains("мышь");
        bag.count("ноут");
        bag.clear();
        bag.info();
    }

    public static void gameFieldMiracles() {
        Scanner scanner = new Scanner(System.in);
        String aiWord = "Абстракция";
        boolean[] booleans = new boolean[aiWord.length()];
        System.out.println("Поле чудес: слово загадано.\nВведите букву или слово");
        while (true) {
            String answer = scanner.next();
            if (answer.length() > 1) {
                if (answer.equalsIgnoreCase(aiWord)) {
                    System.out.println("Победа!");
                    return;
                } else {
                    System.out.println("Пробуй ещё");
                }
            } else {
                char letter = answer.charAt(0);
                for (int i = 0; i < aiWord.length(); i++) {
                    if (aiWord.charAt(i) == letter) {
                        booleans[i] = true;
                    }
                }
                for (int i = 0; i < aiWord.length(); i++) {
                    if (booleans[i]) {
                        System.out.print(aiWord.charAt(i));
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

        }
    }


    public static void gameGuessWord() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"Апельсин", "Банан", "Арбуз", "Яблоко", "Груша",
        "Мандарин", "Киви", "Лимон", "Грейпфрут", "Вишня", "Клубника"};
        String aiWord = words[(int) (Math.random() * words.length)];
        System.out.println("Игра - угадай слово.");
        System.out.println("Список слов на сегодня: " + Arrays.toString(words));
        System.out.println("Компьютер загадал слово. Попробуйте отгадать");
        while (true) {
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(aiWord)) {
                System.out.println("Вы угадали, победа!");
                return;
            }
            char[] aiWordChars = aiWord.toCharArray();
            char[] answerChars = answer.toCharArray();
            int minLength = Math.min(aiWordChars.length, answerChars.length);
            for (int i = 0; i < minLength; i++) {
                if (answerChars[i] == aiWordChars[i]) {
                    System.out.print(answerChars[i]);
                } else {
                    System.out.print("*");
                }
            }
            for (int i = 0; i < 20 - minLength; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void findMinMax() {
        int[] arr = {-10, -2, -5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
