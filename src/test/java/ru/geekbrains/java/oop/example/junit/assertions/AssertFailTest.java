package ru.geekbrains.java.oop.example.junit.assertions;

import org.junit.jupiter.api.*;


public class AssertFailTest {
    @Test
    void name() {
        Assertions.fail("тест упадет всегда");
    }
}
