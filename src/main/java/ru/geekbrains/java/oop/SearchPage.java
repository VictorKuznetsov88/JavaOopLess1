package ru.geekbrains.java.oop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends PageFactory {

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(xpath = ".//header/h2[text()='Профессии']")
    private WebElement textProfessions;

    @FindBy(xpath = ".//header/h2[text()='Курсы']")
    private WebElement textCourses;

    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    private WebElement textEvents;

    @FindBy(xpath = ".//header/h2[text()='Блогbbи']")
    private WebElement textBlogs;

    @FindBy(xpath = ".//header/h2[text()='Форум']")
    private WebElement textForum;

    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    private WebElement textTests;

    @FindBy(xpath = ".//header/h2[text()='Проекты и компании']")
    private WebElement textPprojectAndCompany;


}