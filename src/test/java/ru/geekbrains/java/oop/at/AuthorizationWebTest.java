package ru.geekbrains.java.oop.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;

@Epic(value = "Epic преподаватель")
@Feature("Авторизация")
@Story("Пользователь преподаватель")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация 1")
    @Description("Проверяем что доступен блок Учитель")
    @Test
    @Issue("BUG-100500")
    @TmsLink("TEST-100")
    public void auth() {
        driver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}