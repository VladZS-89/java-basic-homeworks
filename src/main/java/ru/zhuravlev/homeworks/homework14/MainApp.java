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

        try {
            int sum = 0;
            for (String[] el: strArr) {
                for (String str: el) {
                    sum += Integer.parseInt(str);
                }
            }
            System.out.println("Сумма элементов массива = " + sum);
        } catch (AppArrayDataException exData) {
            exData.getMessage();
        } catch (AppArraySizeException exSize) {
            exSize.getMessage();
        }

    }
}
