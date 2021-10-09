package frontend.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import frontend.helper.ApplicationManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod(groups = {"ThirdTest"})
    public void startUpForGroups() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod(groups = {"ThirdTest"})
    public void tearDownForGroups() {
        closeWebDriver();
    }

    @BeforeMethod
    public void startUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
