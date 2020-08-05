package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class CarrerPage extends ContentBasePage {

    public CarrerPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CarrerPage openUrl() {
        super.openUrl("https://geekbrains.ru/career");
        return this;
    }
}
