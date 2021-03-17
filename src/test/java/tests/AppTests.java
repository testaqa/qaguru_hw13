package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

@Feature("Basic elements tests")
public class AppTests extends BaseTest{

    @Test
    @Story("Verify that menu is presented")
    @Tag("web")
    void MenuSectionsPresented() {
        homePage.menuSections.shouldHaveSize(6);
    }

    @Test
    @Story("Verify that search field is exists")
    @Tag("web")
    void SearchFieldExists() {
        homePage.searchField.should(exist);
    }
}
