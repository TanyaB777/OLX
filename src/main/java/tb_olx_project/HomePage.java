package tb_olx_project;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private static final String HOME_CATEGORY_LINK = "[class='css-cbwxzx']";
    private static final String KITCHEN_CATEGORY_LINK = "[href*='posuda-kuhonnaya-utvar']";
    private static final By RUS_LANGUAGE_LINK = By.linkText("Рус");
    private static final By UKR_LANGUAGE_LINK = By.linkText("Укр");
    private static final String SEARCH_INPUT = "#search";
    private static final String CLEAR_BUTTON = "[data-testid = 'clear-btn']";
    private static final String MESSAGE_LINK = "[class='css-1o5oslh']";

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
        SelenideElement elementForScroll = $("[class='css-8h18ka']");
        SelenideElement elementForClick = $(linkSelector);
        executeJavaScript("arguments[0].scrollIntoView(true);", elementForScroll);
        elementForClick.shouldBe(visible);
        elementForClick.click();
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

    public boolean isSearchClearButtonVisible() {
        return ($(CLEAR_BUTTON).isDisplayed());
    }

    public void clickMessageLink() {
        $(MESSAGE_LINK).shouldBe(visible).click();
    }
}


