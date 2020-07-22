package ru.geekbrains.java.oop.example.junit.assertions;

import org.junit.jupiter.api.*;

public class AssertNotNullTest {
    @Test
    void name1() {
        String dogName = "Лорд";

        Assertions.assertNotNull(dogName);
    }
    
    @Test
    void name2() {
        String dogName =null;

        Assertions.assertNotNull(dogName);
    }
}
