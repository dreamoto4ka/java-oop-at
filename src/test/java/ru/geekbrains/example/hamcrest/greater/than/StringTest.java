package ru.geekbrains.example.hamcrest.greater.than;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;


public class StringTest {

//    @Test
//    void greaterThanTest() {
//        int numberActual = 100;
//        int numberExpected = 90;
//
//        MatcherAssert.assertThat(numberActual, greaterThan(numberExpected));
//    }
//
//    @Test
//    void lessThanOrEqualTest() {
//        int numberActual = 50;
//        int numberExpected = 100;
//
//        MatcherAssert.assertThat(numberActual, greaterThanOrEqualTo(numberExpected));
//    }
//
//
//    @Test
//    void closeToTest() {
//        double numberActual = 100.00;
//        double numberExpected = 98.00;
//
//        MatcherAssert.assertThat(numberActual, closeTo(numberExpected, 2));
//    }

    @Test
    void equalToIgnoringCaseTest() {
        String name1 = "Лорд";
        String name2 = "ЛоРД";

        MatcherAssert.assertThat("ЛоРд", endsWithIgnoringCase(name1));

        Assertions.assertEquals("ЛоРд", name1);
    }

    @Test
    void containsStringTest() {
        String name1 = "Лорд Geekbrains Лорд Лорд Лорд";

        MatcherAssert.assertThat(name1, containsString("GeekBrains"));
    }

    @Test
    void endsWithTest() {
        String name1 = "Лорд Geekbrains Лорд Лорд Лорд";

        MatcherAssert.assertThat(name1, endsWith("Geekbrains Лорд Лорд Лорд"));
    }

    @Test
    void equalToCompressingWhiteSpaceTest() {
        String name1 = "Лорд Geekbrains Лорд Лорд                  Лорд";

        MatcherAssert.assertThat(name1, equalToCompressingWhiteSpace("Geekbrains Лорд Лорд Лорд"));
    }

}
