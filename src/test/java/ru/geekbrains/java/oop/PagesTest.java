package ru.geekbrains.java.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.BaseTest;

public class PagesTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//Доработка Тест 1
//
//    Вынести проверку каждой страницы в отдельный тест
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как
//минимум самого блока)

    @Test
    public void courses() throws InterruptedException  {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );


    }
    @Test
    public void events() throws InterruptedException  {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );

    }

    @Test
    public void topics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );
    }

    @Test
    public void posts() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );
    }

    @Test
    public void tests() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );
    }

    @Test
    public void career() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).isEnabled();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        Assertions.assertEquals(
                "8 800 700-68-41",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__phone\"]")).getText()
        );
        Assertions.assertEquals(
                "©",
                chromeDriver.findElement(By.cssSelector("[class=\"site-footer__copyright\"]")).getText()
        );

    }
}

