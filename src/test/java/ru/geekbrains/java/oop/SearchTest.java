package ru.geekbrains.java.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.BaseTest;

import static java.lang.Thread.sleep;

public class SearchTest extends BaseTest {

//    Доработка Тест 2
//
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//   В поле Поиск ввести текст: java
//    Проверить что на странице:
//    Профессий не менее чем 2
//    Курсов более 15
//Вебинаров больше чем 180, но меньше 300
//    В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//    Блогов более 300
//Форумов не 350
//    Тестов не 0
 //   В Проектах и компаниях отображается GeekBrains


    @Test
    public void checkSearch() throws InterruptedException {

        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();

        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
                .sendKeys("java");

        wait15second.until(ExpectedConditions.textToBePresentInElement(
                chromeDriver.findElementByCssSelector("[id=\"professions\"] h2"), "Профессии"));

        chromeDriver.findElementByXPath("//h2[text()='Курсы']");
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
        chromeDriver.findElementByXPath("//h2[text()='Проекты и компании']");

//    Тестов не 0

        Assertions.assertNotEquals(
                " ",
                chromeDriver.findElement(By.cssSelector("[class=\"test-item__level\"]")).getSize()
        );
        }
}
