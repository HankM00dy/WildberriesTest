package frontend.pages;

import com.codeborne.selenide.Configuration;
import frontend.helper.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod(groups = {"ThirdTest"})
    public void startUpForGroups() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod(groups = {"ThirdTest"})
    public void tearDownForGroups() {
        closeWebDriver();
    }

    @BeforeMethod
    public void init() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://www.wildberries.ru");
    }

    @AfterMethod
    public void stop() {
        closeWebDriver();
    }
}
