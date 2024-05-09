package ru.zhuravlev.homeworks.homework19.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/resources/homework19/IOExample.txt")) {
            byte[] bytes = new byte[64];
            int n = fis.read(bytes);
            while (n != -1) {
                System.out.print(new String(bytes, 0, n));
                n = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
