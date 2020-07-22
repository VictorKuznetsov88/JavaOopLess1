package ru.geekbrains.java.oop.example.junit.annotaions.timeout;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;

public class TimeoutTest {

    @Timeout(value = 4)
    @Test
    void name() throws InterruptedException {
        sleep(3000);
    }

}
