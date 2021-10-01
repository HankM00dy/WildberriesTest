package frontend.pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CatalogPage {

    /**
     * Локаторы для страницы CatalogPage
     */

    protected SelenideElement buttonCostumes = $x("//a[text()='Костюмы']");
    protected ElementsCollection imageOfItem = elements(By.xpath("//div[contains(@class,'product-card__img-wrap')]//img"));
    protected SelenideElement checkboxSportCostume = $x("//label[contains(text(),'Костюм спортивный')]");
    protected SelenideElement inputBrandSearch = $x("//div[contains(@data-filter-name,'fbrand')]//input[contains(@class,'j-search-filter')]");
    protected SelenideElement buttonSortByPrice = $x("//a[contains(text(),'цене')]");
    protected SelenideElement checkboxSneakers = $x("//label[contains(text(),'Кроссовки')]");
    protected SelenideElement buttonSneakersSection = $x("//li[contains(@class,'selected')]//a[contains(text(),'Кеды и кроссовки')]");

    /** Методы для тестов */

    /**
     * Сценарий №1. Проход по полному БП
     */

    public CatalogPage clickButtonCostumes() {
        (buttonCostumes).shouldBe(visible).click();
        return this;
    }

    public CatalogPage assertImageOfItemShouldBeVisible() {
        (imageOfItem).shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    public CatalogPage clickCheckboxSportCostume() {
        (checkboxSportCostume).shouldBe(visible).click();
        return this;
    }

    public CatalogPage assertCheckboxShouldBeSelected(String valueOfTextInCheckboxLabel) {
        SelenideElement checkbox = $x("//label[contains(@class,'selected')][contains(text(),'" + valueOfTextInCheckboxLabel + "')]");
        (checkbox).shouldBe(visible).isDisplayed();
        return this;
    }

    public CatalogPage setInputBrandSearch(String textValue) {
        (inputBrandSearch).shouldBe(visible).setValue(textValue);
        return this;
    }

    public CatalogPage clickCheckboxBrand(String brandName) {
        SelenideElement checkboxBrand = $x("//label[contains(text(),'" + brandName + "')]");
        (checkboxBrand).shouldBe(visible).click();
        return this;
    }

    public CatalogPage clickButtonSortByPrice() {
        (buttonSortByPrice).shouldBe(visible).click();
        return this;
    }

    public CatalogPage clickImageProductInCatalog(int index) {
        ElementsCollection imageProductInCatalog = $$x("//div[contains(@class,'product-card__img-wrap')]//img");
        imageProductInCatalog.shouldBe(CollectionCondition.sizeGreaterThan(0));
        SelenideElement image = imageProductInCatalog.get(index);
        Selenide.actions()
                .moveToElement(image, 0, -30)
                .click()
                .build()
                .perform();
        return this;
    }

    public CatalogPage clickButtonSneakersSection() {
        (buttonSneakersSection).shouldBe(visible).click();
        return this;
    }

    public CatalogPage clickCheckboxSneakers() {
        (checkboxSneakers).shouldBe(visible).click();
        return this;
    }
}
