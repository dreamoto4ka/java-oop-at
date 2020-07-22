package ru.geekbrains.example.junit.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueTest {
    @Test
    void name1() {
        Assertions.assertTrue(false, "Тест упал");

    }

    @Test
    void name2() {
        Assertions.assertTrue(true, "Тест прошёл");

    }

}
