package ru.geekbrains.example.junit.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
