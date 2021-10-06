package frontend.suites;

import frontend.pages.TestBase;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test(description = "Сценарий №1. Проход по полному БП")
    public void firstSmokeTest() {
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
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП")
    public void secondSmokeTest() {
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
                .clickButtonSortByPrice();
    }

    @Test(description = "Сценарий №1. Проход по полному БП", groups = {"RightTest"})
    public void thirdSmokeTest() {
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
                .clickButtonSortByPrice();
    }

//    @Test
//    public void firstTest() {
//        System.out.println("First test in Smoke Test Done");
//    }
//
//
//    @Test
//    public void secondTest() {
//        System.out.println("Second test in Smoke Test Done");
//    }
//
//
//    @Test(groups = {"RightTest"})
//    public void thirdTest() {
//        System.out.println("Third test in Smoke Test Done");
//    }
}
