package ru.zhuravlev.homeworks.homework19.examples;

import java.io.File;
import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/homework19/part1");
        System.out.println("exists :" + file.exists());
        System.out.println("canRead : " + file.canRead());
        System.out.println("canWrite : " + file.canWrite());
        System.out.println("canWrite : " + file.canWrite());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.listFiles() = " + Arrays.toString(file.listFiles()));
        File fileDelete = new File("demo.txt");
        fileDelete.delete();

        File fileMake = new File("src/main/resources/homework19/files");
        fileMake.mkdirs();
    }
}
