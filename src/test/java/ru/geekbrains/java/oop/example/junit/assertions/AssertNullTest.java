package ru.geekbrains.java.oop.example.junit.assertions;

import org.junit.jupiter.api.*;

public class AssertNullTest {
    @Test
    void name1() {
        String dogName = "Лорд";

        Assertions.assertNull(dogName);
    }

    @Test
    void name2() {
        String dogName =null;

        Assertions.assertNull(dogName);
    }
}
