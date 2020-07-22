package ru.geekbrains.java.oop.pagetest;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class PagesTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//Доработка Тест 1
//
//    Вынести проверку каждой страницы в отдельный тест
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как
//минимум самого блока)
    @AfterEach
            public void footerTest() {
        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
    }

 //   @CsvSource({"\"[id=\"nav\"] [href=\"/courses\"]", "Курсы", "[id=\"top-menu\"] h2\""})
    //@ValueSource(strings = {"[id=\"nav\"] [href=\"/courses\"]","[id=\"nav\"] [href=\"/events\"]", "[id=\"nav\"] [href=\"/topics\"]", "[id=\"nav\"] [href=\"/posts\"]", "[id=\"nav\"] [href=\"/tests\"]", "[id=\"nav\"] [href=\"/career\"]" })
    @Test
    public void courses() throws InterruptedException  {
     chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
          Assertions.assertEquals(
             "Курсы",
             chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
     );
    }

    @Test
    public void events() throws InterruptedException  {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @Test
    public void topics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @Test
    public void posts() throws InterruptedException {
       chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @Test
    public void tests() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @Test
    public void career() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

   }
}

