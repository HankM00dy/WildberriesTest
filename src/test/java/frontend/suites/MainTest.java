package frontend.suites;

import com.codeborne.selenide.Configuration;
import frontend.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    private MainPage mainPage = new MainPage();
    private MenCategoryPage menCategoryPage = new MenCategoryPage();
    private CatalogPage catalogPage = new CatalogPage();
    private CartPage cartPage = new CartPage();
    private CardOfProductPage cardOfProductPage = new CardOfProductPage();
    private ShoesCategoryPage shoesCategoryPage = new ShoesCategoryPage();
    private LoginPage loginPage = new LoginPage();


    @BeforeMethod
    public void settUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

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
                .clickImageProductInCatalog();
        cardOfProductPage
                .assertImageOFProductShouldBeVisible()
                .clickButtonSizeOfProduct("2")
                .clickButtonAddToCart()
                .assertButtonGoToCartShouldBeVisible();
        String nameOfFirstProduct = cardOfProductPage.getTextNameOfProduct();
        cardOfProductPage
                .clickButtonTurnBack();
        catalogPage
                .clickImageProductInCatalog();
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
                .clickImageProductInCatalog();
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
                .clickButtonFirstAddress()
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