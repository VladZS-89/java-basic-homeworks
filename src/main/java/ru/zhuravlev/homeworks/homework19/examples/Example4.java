package ru.zhuravlev.homeworks.homework19.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(
                new FileInputStream("src/main/resources/homework19/IOExample.txt"))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
