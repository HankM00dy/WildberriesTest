package frontend.suites;

import frontend.pages.TestBase;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test(description = "Сценарий №1. Smoke тест")
    public void firstSmokeTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }

    @Test(description = "Сценарий №2. Smoke тест")
    public void secondSmokeTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }

    @Test(description = "Сценарий №3. Smoke тест", groups = {"ThirdTest"})
    public void thirdSmokeTest() {
        app.mainPage
                .assertInputMainSearchLineShouldBeVisible()
                .clickButtonNavigation()
                .clickButtonMensCategory();
        app.menCategoryPage
                .assertTextHeadingMensCategoryShouldBeVisible()
                .clickButtonClothes();
    }
}
