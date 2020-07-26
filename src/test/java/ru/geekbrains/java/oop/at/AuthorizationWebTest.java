package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;
import ru.geekbrains.java.oop.at.page.BasePage;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

//AuthorizationPage authorizationPage = new AuthorizationPage(driver);

//        PageFactory.initElements(driver, AuthorizationPage.class);
//
//        WebElement inputEmail = driver.findElement(By.cssSelector("[placeholder=\"Email\"]"));
//        WebElement inputPassword = driver.findElement(By.cssSelector("[placeholder=\"Пароль\"]"));

//        inputEmail.sendKeys(login);
//        inputPassword.sendKeys(password);


//        WebElement buttonSingIn = driver.findElement(By.cssSelector("[id=\"registration-form-button\"]"));
//          buttonSingIn.click();

//        authorizationPage.getButtonSingIn().click();

//        BasePage basePage = new BasePage(driver);
//        basePage.checkNamePage("Главная");

//          WebElement titlePage = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
//
//        Assertions.assertEquals("Главная", titlePage.getText());

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");

    }
}
