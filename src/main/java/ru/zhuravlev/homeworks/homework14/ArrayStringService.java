package ru.zhuravlev.homeworks.homework14;

import ru.zhuravlev.homeworks.homework14.exeption.AppArrayDataException;
import ru.zhuravlev.homeworks.homework14.exeption.AppArraySizeException;

/**
 * Сервис расчёта суммы элементов двумерного строкового массива размера 4х4
 */
public class ArrayStringService {
    /**
     * Количество элементов двумерного массива по условию задачи
     */
    private static final int SIZE = 4;

    /**
     * Метод расчёта суммы массива
     *
     * @param strArr строковый двумерный массив размера 4х4
     */
    public static void convertToIntAndSum(String[][] strArr) {
        int sum = 0;
        if (checkArraySize(strArr)) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException exception) {
                    throw new AppArrayDataException(i, j, strArr);
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    /**
     * Метод проверки размера массива
     *
     * @param strArr строковый двумерный массив размера 4х4
     */
    private static boolean checkArraySize(String[][] strArr) {
        if (strArr.length != SIZE) {
            return true;
        }
        for (String[] strings : strArr) {
            if (strings.length != SIZE) {
                return true;
            }
        }
        return false;
    }
}
