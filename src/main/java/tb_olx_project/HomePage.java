package tb_olx_project;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    //777
    private static final String HOME_CATEGORY_LINK = "[class='css-cbwxzx']";
    private static final String KITCHEN_CATEGORY_LINK = "[href*='posuda-kuhonnaya-utvar']";
    private static final By RUS_LANGUAGE_LINK = By.linkText("Рус");
    private static final By UKR_LANGUAGE_LINK = By.linkText("Укр");
    private static final String SEARCH_INPUT = "#search";
    private static final String CLEAR_BUTTON = "[data-testid = 'clear-btn']";
    private static final String MESSAGE_LINK = "[class='css-1o5oslh']";

    @Step("Click on the Home category link")
    public void clickHomeCategoryLink() {
        $(HOME_CATEGORY_LINK).shouldBe(visible).click();
    }

    @Step("Click on the Kitchen category link")
    public void clickKitchenCategoryLink() {
        $(KITCHEN_CATEGORY_LINK).scrollTo().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @Step("Click on the Russian language link")
    public void clickRusLanguageLink() {
        $(RUS_LANGUAGE_LINK).shouldBe(visible).click();
    }

    @Step("Get the color of the Ukrainian language link")
    public String getUkrLinkColor() {
        return $(UKR_LANGUAGE_LINK).shouldBe(visible).getCssValue("color");
    }

    @Step("Click on social button with selector: {linkSelector}")
    public void clickSocialButton(String linkSelector) {
        SelenideElement elementForScroll = $("[class='css-8h18ka']");
        SelenideElement elementForClick = $(linkSelector);
        executeJavaScript("arguments[0].scrollIntoView(true);", elementForScroll);
        elementForClick.shouldBe(visible);
        elementForClick.click();
    }

    @Step("Enter text '{textToSearch}' into the search input and press Enter")
    public void enterSearchText(String textToSearch) {
        $(SEARCH_INPUT).shouldBe(visible).setValue(textToSearch).pressEnter();
    }

    @Step("Type text '{textToSearch}' into the search input")
    public void typeSearchText(String textToSearch) {
        $(SEARCH_INPUT).shouldBe(visible).setValue(textToSearch);
    }

    @Step("Get text from the search input")
    public String getSearchText() {
        return $(SEARCH_INPUT).shouldBe(visible).getText();
    }

    @Step("Click on the clear button")
    public void clickClearButton() {
        $(CLEAR_BUTTON).shouldBe(visible).click();
    }

    @Step("Check if the search clear button is visible")
    public boolean isSearchClearButtonVisible() {
        return ($(CLEAR_BUTTON).isDisplayed());
    }

    @Step("Click on the message link")
    public void clickMessageLink() {
        $(MESSAGE_LINK).shouldBe(visible).click();
    }
}


