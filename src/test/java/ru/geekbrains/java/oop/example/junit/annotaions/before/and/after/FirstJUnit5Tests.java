package ru.geekbrains.java.oop.example.junit.annotaions.before.and.after;

import org.junit.jupiter.api.*;
import ru.geekbrains.java.oop.pagetest.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstJUnit5Tests {


    @BeforeEach
    void setUp1() {
        System.out.println("BaseTest setUp1");
    }

    @BeforeEach
    void setUp2() {
        System.out.println("BaseTest setUp2");
    }


    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println("myFirstTest");
    }

    @Test
    void test2() {
        assertEquals(1, 1 + 1);
        System.out.println("test2");
    }
}

