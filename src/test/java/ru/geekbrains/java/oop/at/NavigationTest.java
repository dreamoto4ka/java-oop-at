package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;


public class NavigationTest {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        chromeDriver = new ChromeDriver(options);

        chromeDriver.get("https://geekbrains.ru/events");
    }

        @Test
    public void topics() throws InterruptedException {
            chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
            Assertions.assertEquals("Форум",
                    chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
    }

    @Test
    public void events() throws InterruptedException {
                chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals("Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());

    }

    @Test
    public void posts() throws InterruptedException {
                chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals("Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());

                chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

    }

    @Test
    public void tests() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals("Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());

    }

    @Test
    public void career() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals("Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());

    }

    @Test
    public void courses() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals("Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());

    }

//

    //    @Test
//    public void checkNavigation() throws InterruptedException {
//
//
//        chromeDriver.get("https://geekbrains.ru/events");
//        sleep(3000);
//
//
//            chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
//            Assertions.assertEquals("Форум",
//                    chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//
//
//            chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
//            Assertions.assertEquals("Вебинары",
//                    chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//
//
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
//        Assertions.assertEquals("Блог",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//        sleep(15000);
//
//        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
//        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
//
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
//        Assertions.assertEquals("Тесты",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
//        Assertions.assertEquals("Карьера",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
//        Assertions.assertEquals("Курсы",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
//
//
//
//    }
    @AfterEach
    public void afterAll(){
        chromeDriver.quit();
    }
}
