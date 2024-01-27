package ru.zhuravlev.homeworks.homework14;

public class MainApp {
    public static void main(String[] args) {
        String[][] strings1 = {
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5"},
                {"3", "8", "1", "6"},
                {"1", "2", "9", "8"}
        };

        String[][] strings2 = {
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5", "11"},
                {"3", "8", "1", "6"},
                {"1", "2", "9", "8"}
        };

        String[][] strings3 = {
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5q"},
                {"3", "8r", "1", "6"},
                {"1", "2", "9", "8m"}
        };

        convertToIntAndSumStringArray(strings1);
        convertToIntAndSumStringArray(strings2);
        convertToIntAndSumStringArray(strings3);
    }

    public static void convertToIntAndSumStringArray(String[][] strArr) throws AppArrayDataException, AppArraySizeException {

        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if (i > 3 || j > 3) {
                    throw new AppArraySizeException();
                }
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (AppArrayDataException exception) {
                    exception.getMessage("[ " + i +  " ] [" + j + " ] " +
                            "элемент массива не удалось преобразовать в число");
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
