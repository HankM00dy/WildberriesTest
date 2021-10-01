package frontend.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ShoesCategoryPage {

    /**
     * Локаторы для страницы ShoesCategoryPage
     */

    protected SelenideElement buttonMenShoes = $x("//div[@id='app']//a[contains(text(),'Мужская')]");

    /** Методы для тестов */

    /**
     * Сценарий №1. Проход по полному БП
     */

    public ShoesCategoryPage clickButtonMenShoes() {
        (buttonMenShoes).shouldBe(Condition.visible).click();
        return this;
    }
}