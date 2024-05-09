package ru.zhuravlev.homeworks.homework19.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/resources/homework19/IOExample.txt")) {
            int n = fis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
