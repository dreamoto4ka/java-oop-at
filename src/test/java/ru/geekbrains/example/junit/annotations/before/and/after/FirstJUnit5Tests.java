package ru.geekbrains.example.junit.annotations.before.and.after;

import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJUnit5Tests extends BaseTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println("BaseTest myFirstTest");
    }

    @Test
    void test2() {
        assertEquals(1, 1 + 1);
        System.out.println("BaseTest test2");
    }
}
