package frontend.suites;

import frontend.pages.TestBase;
import org.testng.annotations.Test;

public class FailureTest extends TestBase {


    @Test(description = "Сценарий №1. Проход по полному БП")
    public void secondTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        app.catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП")
    public void thirdTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        app.catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП", groups = {"ThirdTest"})
    public void firstFailureTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        app.catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП")
    public void secondFailureTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        app.catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП", groups = {"ThirdTest"})
    public void thirdFailureTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        app.catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice()
                .clickImageProductInCatalog(0);
        app.cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfFirstProduct = app.cardOfProductPage.getTextNameOfProduct();
        app.cardOfProductPage
                .clickButtonTurnBack();
        app.catalogPage
                .clickImageProductInCatalog(2);
        app.cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfSecondProduct = app.cardOfProductPage.getTextNameOfProduct();
        app.mainPage
                .clickButtonNavigation()
                .clickButtonShoesCategory();
        app.shoesCategoryPage
                .clickButtonMenShoes();
        app.catalogPage
                .clickButtonSneakersSection()
                .clickCheckboxSneakers()
                .assertCheckboxShouldBeSelected("Кроссовки")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice()
                .clickImageProductInCatalog(0);
        app.cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfThirdProduct = app.cardOfProductPage.getTextNameOfProduct();
        app.cardOfProductPage
                .clickButtonGoToCart();
        app.cartPage
                .assertTextNameOfProductShouldBeVisible(nameOfFirstProduct)
                .assertTextNameOfProductShouldBeVisible(nameOfSecondProduct)
                .assertTextNameOfProductShouldBeVisible(nameOfThirdProduct)
                .clickButtonOrder()
                .clickButtonSelectAddress()
                .clickButtonSelectAddressInDialog()
                .clickButtonFirstAddress(0)
                .clickButtonApplyLocation()
                .clickButtonPaidByCard()
                .setInputName("1111111111")
                .setInputSurname("1111111111")
                .setInputPhone("1111111111")
                .clickButtonConfirmOrder()
                .assertTextErrorIncorrectNameShouldBeVisible()
                .assertTextErrorIncorrectSurnameShouldBeVisible()
                .clickButtonEnter();
        app.loginPage
                .assertTextHeadingEnterInYourProfileShouldBeVisible();
    }
}