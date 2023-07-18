package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void createDirectory() {
        //Создалась ли папка без ошибок в нашем проекте
        File file = new File("temp/");
        boolean isDirectory = file.isDirectory();
        assertTrue(isDirectory);
    }

    @Test
    void createFile() {
        File file = new File("C://Programming//JAVA нетология//HWTest//src//main//Main.java");
        boolean isFile = file.isFile();
        assertTrue(isFile);
    }
}