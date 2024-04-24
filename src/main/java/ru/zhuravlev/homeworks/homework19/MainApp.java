package ru.zhuravlev.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String rootPath = "src";
        File file = printListOfFiles(rootPath);
        String targetFile = getFileName(rootPath);
        readFile(file, targetFile);
        writeInFile(file, targetFile);
    }

    /**
     * Метод проверяет введённое в консоле название файла и в случае его наличия в каталоге, возвращает название.
     *
     * @param rootPath директория каталога файлов
     * @return название существующего файла
     */
    private static String getFileName(String rootPath) {
        System.out.println("Выберите файл, с которым Вы хотите работать:");
        Scanner scanner = new Scanner(System.in);
        String targetFile = rootPath + "/" + scanner.next();
        while (!(new File(targetFile).exists())) {
            System.out.println("Вы ввели несуществующий файл, попробуйте ещё раз:");
            targetFile = rootPath + "/" + scanner.next();
        }
        return targetFile;
    }

    /**
     * Метод печатает список файлов из директории
     *
     * @param rootPath директория каталога файлов
     * @return File - путь к файлу(ам)
     */
    private static File printListOfFiles(String rootPath) {
        System.out.println("Список файлов каталога:");
        File file = new File(rootPath);
        for (File f : Objects.requireNonNull(file.listFiles())) {
            System.out.println("f.toString() = " + f.toString());
        }
        return file;
    }

    /**
     * Метод читает даныне из файла
     *
     * @param file       путь к файлу
     * @param targetFile имя файла
     */
    private static void readFile(File file, String targetFile) {
        System.out.println("Информация в файле:");
        if (file.exists()) {
            try (InputStreamReader isr = new InputStreamReader(
                    new FileInputStream(targetFile))) {
                int n = isr.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = isr.read();
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод пишет в файл введённую пользователем в консоле строку с данными.
     *
     * @param file       путь к файлу
     * @param targetFile имя файла
     */
    private static void writeInFile(File file, String targetFile) {
        System.out.println("Введите текст для записи в файл:");
        Scanner scanner1 = new Scanner(System.in);
        String text = scanner1.nextLine();
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(targetFile, true))) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            for (byte b : buffer) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        readFile(file, targetFile);
    }
}
