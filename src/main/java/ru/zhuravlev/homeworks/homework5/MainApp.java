package ru.zhuravlev.homeworks.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        printStringNTimes(5, "привет");

        sumIfElemGreaterThanFive(new int[]{1, 4, 5, 7, 9, 10, 11, 31, 44, 3, 2, 12});

        int[] arrayOne = {12, 1124, 1451, 151, 161, 6, 16};
        fillingArrayByN(9, arrayOne);

        int[] arrayTwo = {5, 6, 7, 8, 9};
        increaseEachElementByN(10, arrayTwo);

        whichHalfOfArrayIsBigger(new int[]{15, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});

        sumArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7}, new int[]{8, 9});

        findPointEquality(new int[]{5, 6, 7, 3, 7, 6, 5});
        findPointEquality(new int[]{1, 1, 1, 1, 1, 5});

        sortArray();

        reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public static void printStringNTimes(int n, String s) {
        for (int i = 1; i <= n; i++) {
            System.out.print(s + " " + i + "; ");
        }
        System.out.println();
    }

    public static void sumIfElemGreaterThanFive(int[] arr) {
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
        int halfLength = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            if (i < halfLength) {
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

    public static void sumArrays(int[]... arrays) {
        System.out.println("Получили набор массивов:");
        int n = 0;
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
            if (arrays[i].length > n) {
                n = arrays[i].length;
            }
        }
        int[] result = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                result[j] += arrays[i][j];
            }
        }
        System.out.println("Массив, равный сумме входящих: " + Arrays.toString(result));
    }

    public static void findPointEquality(int[] ar) {
        int sumLeft = ar[0];
        int sumRight = ar[ar.length - 1];
        int countLeft = 0;
        int countRight = ar.length - 1;
        for (int i = 1; i <= ar.length; i++) {
            if (countLeft == countRight) {
                System.out.println("В массиве " + Arrays.toString(ar) + " нет точки равенства сумм левой и правой части");
                return;
            } else if (sumLeft == sumRight) {
                if (countRight - countLeft == 1) {
                    System.out.println("В массиве " + Arrays.toString(ar) + " точка равенства левой и правой частей между "
                            + countLeft + " и " + countRight + " элементами");
                    return;
                }
                sumLeft += ar[i];
                sumRight += ar[ar.length - 1 - i];
                countLeft++;
                countRight--;
            } else if (sumLeft > sumRight) {
                sumRight += ar[ar.length - 1 - i];
                countRight--;
            } else {
                sumLeft += ar[i];
                countLeft++;
            }
        }
    }

    public static void sortArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = scanner.nextInt();
        System.out.println("Введите " + n + " элементов числового массива:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + " элемент массива - ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Получился числовой массив: " + Arrays.toString(array));
        System.out.println("Выберите сортировку массива:\n1 - по возрастанию\n2 - по убыванию");
        while (true) {
            int s = scanner.nextInt();
            if (s == 1) {
                Arrays.sort(array);
                System.out.println("Результат: " + Arrays.toString(array));
                break;
            } else if (s == 2) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] < array[j]) {
                            int x = array[i];
                            array[i] = array[j];
                            array[j] = x;
                        }
                    }
                }
                System.out.println("Результат: " + Arrays.toString(array));
                break;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
    }

    private static void reverseArray(int[] array) {
        System.out.println("массив1: " + Arrays.toString(array));
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        System.out.println("массив2: " + Arrays.toString(array));
    }
}
