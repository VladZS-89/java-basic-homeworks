package ru.zhuravlev.homeworks.homework07;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        int[][] array2 = {
                {4, -7, 2},
                {-9, 1, 6},
                {5, -8, 3}
        };

        int[][] array3 = {
                {-14, 7, 12, 5, -1, -17,},
                {9, -11, -6, 0, 3, -11, 12},
                {5, -8, 3, 4, -2}
        };

        System.out.println("Результат метода sumOfPositiveElements:\n" + sumOfPositiveElements(array3));

        square(5);

        zeroingDiagonals(array);

        System.out.println("Результат метода findMax:\n" + findMax(array2));

        System.out.println("Результат метода sumSecondRowOrMinusOne:\n" + sumSecondRowOrMinusOne(array));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                if (array[y][x] > 0) {
                    sum += array[y][x];
                }
            }
        }
        return sum;
    }

    public static void square(int size) {
        // заполненный квадрат
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        // пустой квадрат (первый вариант)
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                if (y > 1 && y < size && x > 1 && x < size) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // пустой квадрат (второй вариант)
        for (int y = 1; y <= size; y++) {
            System.out.print(" * ");
            for (int x = 2; x < size; x++) {
                if (y == 1 || y == size) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" * ");
        }
        System.out.println();
    }


    public static void zeroingDiagonals(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                if (y == x) {
                    array[y][x] = 0;
                }
                if (x + y == array.length - 1) {
                    array[y][x] = 0;
                }
            }
            System.out.println(Arrays.toString(array[y]));
        }
    }

    public static int findMax(int[][] array) {
        int maxElem = Integer.MIN_VALUE;
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                if (array[y][x] > maxElem) {
                    maxElem = array[y][x];
                }
            }
        }
        return maxElem;
    }

    public static int sumSecondRowOrMinusOne(int[][] array) {
        int sum = 0;
        int[] voidArray = new int[]{};
        for (int y = 0; y < array.length; y++) {
            if (array.length < 2 || Arrays.equals(array[1], voidArray)) {
                return -1;
            }
            for (int x = 0; x < array[y].length; x++) {
                if (y == 1) {
                    sum += array[y][x];
                }
            }
        }
        return sum;
    }
}