package frontend.pages;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import frontend.helper.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();
    protected SoftAssert softAssert;
//    protected Logger logger;


    @BeforeMethod
    public void init() {
        System.setProperty("selenide.browser", "Chrome");
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod
    public void stop() {
        closeWebDriver();
    }
}
