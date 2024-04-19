package ru.zhuravlev.homeworks.homework17;

import java.util.Arrays;

/**
 * Класс-демо методов сортировки
 */
public final class SorterForArray {
    /**
     * Метод сортировки "пузырьком"
     *
     * @param array целочисленный массив
     * @return сортированный массив методом "пузырька"
     */
    public static int[] bubbleSort(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    /**
     * Метод сортировки со сложностью O(n * log(n))
     *
     * @param array целочисленный массив
     * @return сортированный массив со сложностью O(n * log(n))
     */
    public static int[] quickSort(int[] array) {
//        quickSort(array, array[0], array[array.length-1]);
        return array;
    }

/*    private static void quickSort(int[] arr, int first, int last) {
        if (first < last) {
            int index = partition(arr, first, last);
            quickSort(arr, first, index - 1);
            quickSort(arr, index + 1, last);
        }
    }

    private static int partition(int[] arr, int first, int last) {
        int core = arr[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (arr[j] <= core) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = swapTemp;
        return i + 1;
    }*/
}
