package ru.netology;

import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> directory = new ArrayList<>(Arrays.asList("res/",
                "res/", "src/",
                "savegames/", "temp/",
                "src/main", "src/test",
                "res/drawables", "res/vectors",
                "res/icons"));
        ArrayList<String> files = new ArrayList<>(Arrays.asList("C://Programming//JAVA нетология//HWTest//src//main//Main.java",
                "C://Programming//JAVA нетология//HWTest//src//main//Utils.java",
                "C://Programming//JAVA нетология//HWTest//temp//temp.txt"));

        for (int i = 0; i < directory.size() && i < files.size(); i++) {
            createDirectory(directory.get(i));
            createFile(files.get(i));
        }
    }

    public static void createDirectory(String url) {
        File file = new File(url);
        try {
            if (file.mkdir()) {
                StringBuilder sb = new StringBuilder();
                sb.append(file);
                String text = sb.toString();
                FileWriter writer = new FileWriter("temp/temp.txt");
                writer.write(text);
                writer.append("\nВсе файлы были созданы успешно!");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void createFile(String url) {
        File file = new File(url);
        try {
            if (file.createNewFile()) {
                StringBuilder sb = new StringBuilder();
                sb.append(file);
                String text = sb.toString();
                FileWriter writer = new FileWriter("temp/temp.txt");
                writer.write(text);
                writer.append("\nВсе файлы были созданы успешно!");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}