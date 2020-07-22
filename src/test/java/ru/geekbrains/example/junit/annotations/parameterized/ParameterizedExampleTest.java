package ru.geekbrains.example.junit.annotations.parameterized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParameterizedExampleTest {
//    @Test
//    void string() {
//        Assertions.assertNotNull("");
//    }
//
//    @Test
//    void integer() {
//        Assertions.assertNotNull(1);
//        }

    @ParameterizedTest
    @ValueSource(strings = {"Том", "Джерри"})
    void check(String name) {
        Assertions.assertNotNull(name);
    }

    @ParameterizedTest
    @MethodSource("listName")
    void method(String name) {
        Assertions.assertNotNull(name);
    }

    public static Stream<String> listName() {
        return Stream.of("Ларри", "Кинг");
    }

    @ParameterizedTest
    @MethodSource("listNameMulti")
    void methodMulti(String name, int age) {
        Assertions.assertNotNull(name);
        Assertions.assertNotNull(age);
    }

    public static Stream<Arguments> listNameMulti() {
        return Stream.of(
                Arguments.of("Том", 5),
                Arguments.of("Джерри", 2)
        );
    }

}
