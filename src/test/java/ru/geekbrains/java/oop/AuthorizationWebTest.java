package ru.geekbrains.java.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import io.qameta.allure.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.BaseWebTest;
import ru.geekbrains.java.oop.AuthorizationPage;


@Feature("Авторизация")
@Story("Авторизация пользователя преподаватель")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Description("Проверяем доступ пользователя Преподаватель, проверка страницы Главная, Нажать в навигации \"Курсы\", Нажать в шапке сайта курсы, Быбрать чекбоксы Бесплатно и Тестирование, Проверка выбора")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";
        String nameButton="Курсы";

//Авторизация проверка главной страницы
        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");

//Нажать в навигации "Курсы"
        new AuthorizationPage(driver)
                .getButton(nameButton).click();

//Нажать в шапке сайта курсы
       driver.findElement(By.xpath("//a[@class='text-dark-dk' and @href='#cour-new']")).click();
     //  System.out.println(driver.findElement(By.xpath("//a[@class='text-dark-dk' and @href='#cour-new']")).getText());

//Быбрать чекбоксы Бесплатно и Тестирование

       driver.findElement(By.cssSelector("[id=\"filter-0\"]")).click();
       driver.findElement(By.cssSelector("[id=\"filter-9\"]")).click();

//Проверка выбора
        Assertions.assertEquals(
                "Тестирование ПО. Уровень 2\n" +
                        "Работа с документацией и тестирование приложений",
                driver.findElement(By.xpath("//a[@class='gb-course-card__wrapper' and @href = '/courses/85']")).getText());

        Assertions.assertEquals(
                "Тестирование ПО. Уровень 1\n" +
                        "Теоретические знания и начальный опыт",
                driver.findElement(By.xpath("//a[@class='gb-course-card__wrapper' and @href = '/courses/84']")).getText());

        //System.out.println(driver.findElement(By.xpath("//a[@class='gb-course-card__wrapper' and @href = '/courses/85']")).getText());


    }

}
