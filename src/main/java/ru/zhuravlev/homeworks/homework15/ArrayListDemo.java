package ru.zhuravlev.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static List<Integer> sort(int min, int max) {
        List<Integer> sortedIntList = new ArrayList<>();
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        for (int i = min; i < max; i++) {
            sortedIntList.add(i);
        }
        return sortedIntList;
    }

    public static long sumListValuesIfMoreThenFive(List<Integer> integerList) {
        long sum = 0;
        for (Integer i : integerList) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }
}
