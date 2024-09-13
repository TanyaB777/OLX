package tb_olx_project;

import org.openqa.selenium.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final String HOME_CATEGORY_LINK = "[class='css-cbwxzx']";
    private static final String KITCHEN_CATEGORY_LINK = "[href*='posuda-kuhonnaya-utvar']";
    private static final String RUS_LANGUAGE_LINK = "Рус";
    private static final String UKR_LANGUAGE_LINK = "Укр";
    private static final String SEARCH_INPUT = "search";
    private static final String CLEAR_BUTTON = "[data-testid = 'clear-btn']";

    public void clickHomeCategoryLink() {
        $(HOME_CATEGORY_LINK).shouldBe(visible).click();
    }

    public void clickKitchenCategoryLink() {
        $(KITCHEN_CATEGORY_LINK).shouldBe(visible).click();
    }

    public void clickRusLanguageLink() {
        $(RUS_LANGUAGE_LINK).shouldBe(visible).click();
    }

    public void clickUkrLanguageLink() {
        $(UKR_LANGUAGE_LINK).shouldBe(visible).click();
    }

    public String getRusLinkColor() {
        return $(RUS_LANGUAGE_LINK).shouldBe(visible).getCssValue("color");
    }

    public String getUkrLinkColor() {
        return $(UKR_LANGUAGE_LINK).shouldBe(visible).getCssValue("color");
    }

    public void clickSocialButton(String linkSelector) {
        $(linkSelector).scrollTo().click();
    }

    public void enterSearchText(String textToSearch) {
        $(SEARCH_INPUT).shouldBe(visible).setValue(textToSearch).pressEnter();
    }

    public void typeSearchText(String textToSearch) {
        $(SEARCH_INPUT).shouldBe(visible).setValue(textToSearch);
    }

    public String getSearchText() {
        return $(SEARCH_INPUT).shouldBe(visible).getText();
    }

    public void clickClearButton() {
        $(CLEAR_BUTTON).shouldBe(visible).click();
    }

    public boolean isSearchClearButtonInvisible() {
        try {
            $(CLEAR_BUTTON).shouldNotBe(visible, Duration.ofSeconds(10));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isSearchClearButtonVisible() {
        try {
            $(CLEAR_BUTTON).shouldBe(visible, Duration.ofSeconds(10));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}


