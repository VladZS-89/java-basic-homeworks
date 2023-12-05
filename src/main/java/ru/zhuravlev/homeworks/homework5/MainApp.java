package ru.zhuravlev.homeworks.homework5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        printStringNTimes(5, "привет");

        sumIfElemMoreThanFive(new int[]{1, 4, 5, 7, 9, 10, 11, 31, 44, 3, 2, 12});

        int[] arrayOne = {12, 1124, 1451, 151, 161, 6, 16};
        fillingArrayByN(9, arrayOne);

        int[] arrayTwo = {5, 6, 7, 8, 9};
        increaseEachElementByN(10, arrayTwo);

        whichHalfOfArrayIsBigger(new int[]{15, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
    }

    public static void printStringNTimes(int n, String s) {
        for (int i = 1; i <= n; i++) {
            System.out.print(s + " " + i + "; ");
        }
        System.out.println();
    }

    public static void sumIfElemMoreThanFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма чисел массива, значение которых больше 5 = " + sum);
    }

    public static void fillingArrayByN(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void increaseEachElementByN(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void whichHalfOfArrayIsBigger(int[] arr) {
        int sumFirstHalfArray = 0;
        int sumSecondHalfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                sumFirstHalfArray += arr[i];
            } else {
                sumSecondHalfArray += arr[i];
            }
        }
        if (sumFirstHalfArray > sumSecondHalfArray) {
            System.out.println("Сумма чисел первой половины массива больше: " + sumFirstHalfArray + " > " + sumSecondHalfArray);
        } else if (sumFirstHalfArray < sumSecondHalfArray) {
            System.out.println("Сумма второй половины массива больше: " + sumFirstHalfArray + " < " + sumSecondHalfArray);
        } else {
            System.out.println("Сумма чисел первой и второй половин массива равны: " + sumFirstHalfArray + " = " + sumSecondHalfArray);
        }
    }


}
