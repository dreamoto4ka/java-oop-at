package ru.geekbrains.java.oop.at;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseTest;

public class SearchTest extends BaseTest{

    @Test
    public void checkSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://geekbrains.ru/events");


        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();

        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
                .sendKeys("java");

        wait15second.until(ExpectedConditions.textToBePresentInElement(
                chromeDriver.findElementByCssSelector("[id=\"professions\"] h2"), "Профессии"));

        chromeDriver.findElementByXPath("//h2[text()='Курсы']");
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
//        chromeDriver.findElementByXPath("//h2[text()='Профессии']");
        chromeDriver.findElementByXPath("//h2[text()='Проекты и компании']");


        System.out.println("Первый тест");
    }
}
