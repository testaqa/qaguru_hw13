package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Feature("login and logout tests")
public class MoreTests extends BaseTest{

    @Test
    @Tag("web")
    void NewTest1() {
        step("Verify menu sections count", () -> {
            homePage.menuSections.shouldHaveSize(6);
        });
    }

    @Test
    @Tag("web")
    void NewTest2() {
        step("Verify search field exists", () -> {
            homePage.searchField.should(exist);
        });
    }

    @Test
    @AllureId("1963")
    @Tag("web")
    void SushiPageTitle() {
        step("Open Sushi page", () -> {
            $(".icon-sushi").click();
        });
        step("Verify if title text is 'sushi sets'", () -> {
            $(".content-subhead__title").shouldHave(text("sushi sets"));
        });
    }
}
