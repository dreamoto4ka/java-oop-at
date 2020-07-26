package ru.geekbrains.java.oop.at.block;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.stream.Stream;

public class Navigation extends PageFactory {

    public Navigation(WebDriver driver){
        initElements(driver, this);
    }

//        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
//
//
//    public static Stream<Arguments> dataProvider() {
//        return Stream.of(
//                Arguments.of("Форум", "topics"),
//                Arguments.of("Вебинары", "events"),
//                Arguments.of("Тесты", "tests"),
//                Arguments.of("Карьера", "career")
////                Arguments.of("Курсы", "courses")
//        );
//    }

    @FindBy(css = "[id=\"nav\"] [href=\"/posts\"]")
    private WebElement buttonPosts;

    @FindBy(css = "[id=\"nav\"] [href=\"/topics \"]")
    private WebElement buttonTopics;

    @FindBy(css = "[id=\"nav\"] [href=\"/events\"]")
    private WebElement buttonEvents;

    @FindBy(css = "[id=\"nav\"] [href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[id=\"nav\"] [href=\"/carer\"]")
    private WebElement buttonCarer;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    public  WebElement getButton(String nameButton){
        switch (nameButton){
            case "Курсы":{
                return buttonCourses;
            }
            case "Вебинары":{
                return buttonEvents;
            }
            case "Форум":{
                return buttonTopics;
            }
            case "Блог":{
                return buttonPosts;
            }
            case "Тесты":{
                return buttonTests;
            }
            case "Карьера":{
                return buttonCarer;
            }
        }

        throw new RuntimeException("кнопки: "+nameButton+ " нет на странице");
    }

//    public WebElement getButtonPosts() {
//        return buttonPosts;
//    }
//
//    public WebElement getButtonTopics() {
//        return buttonTopics;
//    }
//
//    public WebElement getButtonEvents() {
//        return buttonEvents;
//    }
//
//    public WebElement getButtonTests() {
//        return buttonTests;
//    }
//
//    public WebElement getButtonCarer() {
//        return buttonCarer;
//    }
//
//    public WebElement getButtonCourses() {
//        return buttonCourses;
//    }
}

