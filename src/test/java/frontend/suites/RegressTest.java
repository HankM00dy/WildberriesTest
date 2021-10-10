package frontend.suites;

import frontend.pages.TestBase;
import org.testng.annotations.Test;

public class RegressTest extends TestBase {

    @Test(description = "Сценарий №1. Регресс тест")
    public void firstRegressTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }

    @Test(description = "Сценарий №2. Регресс тест")
    public void secondRegressTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }

    @Test(description = "Сценарий №3. Регресс тест", groups = {"ThirdTest"})
    public void thirdRegressTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }

    @Test(description = "Сценарий №4. Регресс тест")
    public void fourthRegressTest() {
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
