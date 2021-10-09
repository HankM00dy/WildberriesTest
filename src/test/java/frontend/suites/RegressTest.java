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
}
