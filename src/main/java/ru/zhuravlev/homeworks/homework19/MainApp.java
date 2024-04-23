package ru.zhuravlev.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String rootPath = "src";
        System.out.println("Список файлов корневого каталога:");
        File file = new File(rootPath);

        for (File f : Objects.requireNonNull(file.listFiles())) {
            System.out.println("f.toString() = " + f.toString());
        }

        System.out.println("Выберите файл, с которым Вы хотите работать:");
        Scanner scanner = new Scanner(System.in);
        String targetFile = rootPath + "/" + scanner.next();

        System.out.println("Информация в файле:");
        readFile(file, targetFile);

        writeInFile(file, targetFile);
    }

    private static void readFile(File file, String targetFile) {
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
        System.out.println("Теперь в файле записано:");
        readFile(file, targetFile);
    }
}
