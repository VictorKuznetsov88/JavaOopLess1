package ru.geekbrains.java.oop.example.junit.annotaions.display.name;

import org.junit.jupiter.api.*;


@DisplayName("Тестовый набор")
public class DisplayNameTest {


    @DisplayName("Тестовый случай")
    @Test
    void name() {
        System.out.println("123");
    }
}
