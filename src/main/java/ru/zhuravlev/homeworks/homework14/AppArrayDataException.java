package ru.zhuravlev.homeworks.homework14;

public class AppArrayDataException extends NumberFormatException {
    public AppArrayDataException(int i, int j, String[][] strArr) {
        super("[" + i + "][" + j + "] " +
                "элемент массива со значение - " + strArr[i][j] +
                " - не удалось преобразовать в число ");
    }
}
