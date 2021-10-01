package frontend.helper;

import com.codeborne.selenide.Configuration;
import frontend.pages.*;
import org.openqa.selenium.remote.BrowserType;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
    public MainPage mainPage = new MainPage();
    public MenCategoryPage menCategoryPage = new MenCategoryPage();
    public CatalogPage catalogPage = new CatalogPage();
    public CartPage cartPage = new CartPage();
    public CardOfProductPage cardOfProductPage = new CardOfProductPage();
    public ShoesCategoryPage shoesCategoryPage = new ShoesCategoryPage();
    public LoginPage loginPage = new LoginPage();
    public String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
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

    public void stop() {
        closeWebDriver();
    }
}
