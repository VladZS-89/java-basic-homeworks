package ru.zhuravlev.homeworks.homework30;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainApp {
    private static final Logger logger = LogManager.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        logger.trace("Кейс с результатом в виде пустого массива: {}", afterUnit(new int[]{1, 2, 1}));
        logger.trace("Новый массив: {}", afterUnit(new int[]{1, 2, 1, 2, 2, 2, 2}));
        logger.error("Выбрасываем ошибку {}", afterUnit(new int[]{2, 2, 2}));
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
            throw new RuntimeException("нет единиц в массиве: " + Arrays.toString(arr));
        }
        if (indexFlag == arr.length - 1) {
            return new int[]{};
        }
        return Arrays.copyOfRange(arr, indexFlag + 1, arr.length);
    }

    public static boolean checkArr(int[] arr) {
        boolean flagOne = false;
        boolean flagTwo = false;
        for (int k : arr) {
            if (k != 1 && k != 2) {
                return false;
            }
            if (k == 1) {
                flagOne = true;
            }
            if (k == 2) {
                flagTwo = true;
            }
        }
        return flagOne && flagTwo;
    }
}
