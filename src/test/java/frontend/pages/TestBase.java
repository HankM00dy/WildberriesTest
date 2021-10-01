package frontend.pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    protected MainPage mainPage = new MainPage();
    protected MenCategoryPage menCategoryPage = new MenCategoryPage();
    protected CatalogPage catalogPage = new CatalogPage();
    protected CartPage cartPage = new CartPage();
    protected CardOfProductPage cardOfProductPage = new CardOfProductPage();
    protected ShoesCategoryPage shoesCategoryPage = new ShoesCategoryPage();
    protected LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUp() {
        String browser = BrowserType.FIREFOX;
        if (browser == BrowserType.FIREFOX) {
            Configuration.browser = "firefox";
        } else if (browser == BrowserType.CHROME) {
            Configuration.browser = "chrome";
        } else if (browser == BrowserType.OPERA) {
            Configuration.browser = "opera";
        }
            Configuration.startMaximized = true;
            Configuration.timeout = 5000;
            open("https://www.wildberries.ru");
        }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
