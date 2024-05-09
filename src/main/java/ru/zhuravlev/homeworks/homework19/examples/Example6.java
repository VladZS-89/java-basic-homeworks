package ru.zhuravlev.homeworks.homework19.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example6 {
    public static void main(String[] args) {
        String data = "Example6 test";
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/homework19/IOexample3.txt")) {
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
                fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
