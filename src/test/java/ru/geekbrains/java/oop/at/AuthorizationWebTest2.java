package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;

@DisplayName("Авторизация")
public class AuthorizationWebTest2 extends BaseWebTest {

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

//        ContentPage basePage = new ContentPage(driver);
//        basePage.checkNamePage("Главная");

//          WebElement titlePage = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
//
//        Assertions.assertEquals("Главная", titlePage.getText());

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");

    }
}
