package ru.geekbrains.example.junit.annotations.before.and.after;

import org.junit.jupiter.api.*;

public class BaseTest {
    @BeforeAll
    static void beforeAllBaseTest() {
   System.out.println("BaseTest beforeAll");
    }

    @BeforeEach
    void setUp1BaseTest() {

        System.out.println("BaseTest setUp1");
    }


    @BeforeEach
    void setUp2BaseTest() {

        System.out.println("BaseTest setUp2");
    }
    @AfterEach
    void tearDownBaseTest() {

        System.out.println("BaseTest tearDown");
    }

    @AfterAll
    static void afterAllBaseTest() {

        System.out.println("BaseTest afterAll");
    }
}
