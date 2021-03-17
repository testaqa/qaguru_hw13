package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

public class AppTests extends BaseTest{

    @Test
    @Tag("web")
    void MenuSectionsPresented() {
        homePage.menuSections.shouldHaveSize(6);
    }

    @Test
    @Tag("web")
    void SearchFieldExists() {
        homePage.searchField.should(exist);
    }
}
