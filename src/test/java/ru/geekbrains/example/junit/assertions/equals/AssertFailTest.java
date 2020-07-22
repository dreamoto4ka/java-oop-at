package ru.geekbrains.example.junit.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertFailTest {
    @Test
    void name() {
        Assertions.fail("тест упадёт всегда");
    }
}
