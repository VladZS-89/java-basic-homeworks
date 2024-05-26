package ru.zhuravlev.homeworks.homework30;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainApp {
    private static final Logger logger = LogManager.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        logger.info("Новый массив " + Arrays.toString(afterUnit(new int[]{1, 2, 1, 2, 2, 2, 2})));
//        System.out.println("afterUnit(new int[]{}) = " + Arrays.toString(afterUnit(new int[]{1, 2, 1, 2, 2, 2, 2})));
        System.out.println("afterUnit(new int[]{}) = " + afterUnit(new int[]{2, 2, 2}));
    }

    public static int[] afterUnit(int[] arr) {
        boolean flag = false;
        int indexFlag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                flag = true;
                indexFlag = i;
            }
        }
        if (!flag) {
            throw new RuntimeException("нет единицв массиве: " + Arrays.toString(arr));
        }
        return Arrays.copyOfRange(arr, indexFlag + 1, arr.length);
    }

    public static boolean checkArr(int[] arr) {
        for (int j : arr) {
            if (j != 1 || j != 2) {
                return false;
            }
        }
        return true;
    }
}
