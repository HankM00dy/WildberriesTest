package frontend.suites;

import frontend.pages.TestBase;
import org.testng.annotations.Test;

public class MainTest extends TestBase {


    @Test(description = "Сценарий №1. Проход по полному БП")
    public void testAddProductToCart() {
        mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
        catalogPage
                .clickButtonCostumes()
                .assertImageOfItemShouldBeVisible()
                .clickCheckboxSportCostume()
                .assertCheckboxShouldBeSelected("Костюм спортивный")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice()
                .clickImageProductInCatalog(0);
        cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfFirstProduct = cardOfProductPage.getTextNameOfProduct();
        cardOfProductPage
                .clickButtonTurnBack();
        catalogPage
                .clickImageProductInCatalog(2);
        cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfSecondProduct = cardOfProductPage.getTextNameOfProduct();
        mainPage
                .clickButtonNavigation()
                .clickButtonShoesCategory();
        shoesCategoryPage
                .clickButtonMenShoes();
        catalogPage
                .clickButtonSneakersSection()
                .clickCheckboxSneakers()
                .assertCheckboxShouldBeSelected("Кроссовки")
                .setInputBrandSearch("adidas")
                .clickCheckboxBrand("adidas")
                .assertCheckboxShouldBeSelected("adidas")
                .clickButtonSortByPrice()
                .clickImageProductInCatalog(0);
        cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfThirdProduct = cardOfProductPage.getTextNameOfProduct();
        cardOfProductPage
                .clickButtonGoToCart();
        cartPage
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
        loginPage
                .assertTextHeadingEnterInYourProfileShouldBeVisible();
    }
}