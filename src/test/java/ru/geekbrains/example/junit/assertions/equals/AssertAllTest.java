package ru.geekbrains.example.junit.assertions.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    void name() {
        assertAll("Пользователь",
                () -> assertEquals("Иван", "Пётр"),
                () -> assertEquals("Иванов", "Васильев")
        );
    }
}
