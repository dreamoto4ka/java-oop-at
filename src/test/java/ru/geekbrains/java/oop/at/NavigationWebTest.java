package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.block.Navigation;
import ru.geekbrains.java.oop.at.page.BasePage;

import java.util.stream.Stream;

@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebTest {

//    Перейти на сайт https://geekbrains.ru/events
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)

@BeforeEach
public void  beforeEach() {
    driver.get("https://geekbrains.ru/events");
}

    @AfterEach
    void tearDown() {

//        BasePage basePage = new BasePage();
//
//        wait15second.until(ExpectedConditions.visibilityOf(
//                basePage.getHeader()));
//        wait15second.until(ExpectedConditions.visibilityOf(
//                basePage.getFooter()));
//    }

        BasePage basePage = PageFactory.initElements(driver, BasePage.class);

        wait15second.until(ExpectedConditions.visibilityOf(
                basePage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                basePage.getFooter()));
    }

    @DisplayName("Блог")
    @Test
    public void posts() {
        String namePage="Блог";
        BasePage basePage = new BasePage(driver);

        basePage.getNavigation().getButton(namePage).click();
        basePage.getButtonClosePopUp1().click();
        basePage.getButtonClosePopUp2().click();

        basePage.checkNamePage(namePage);
    }

    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage) {
        BasePage basePage = new BasePage(driver);
        basePage.getNavigation().getButton(namePage).click();
        basePage.checkNamePage(namePage);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум", "topics"),
                Arguments.of("Вебинары", "events"),
                Arguments.of("Тесты", "tests"),
                Arguments.of("Карьера", "career")
//                Arguments.of("Курсы", "courses")
        );
    }
}