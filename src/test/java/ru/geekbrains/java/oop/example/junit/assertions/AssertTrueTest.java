package ru.geekbrains.java.oop.example.junit.assertions;

import org.junit.jupiter.api.*;

public class AssertTrueTest {
    @Test
    void name1() {
        Assertions.assertTrue(false,"Тест упал");
    }

    @Test
    void name2() {
        Assertions.assertTrue(true,"Тест прошел");
    }
}
