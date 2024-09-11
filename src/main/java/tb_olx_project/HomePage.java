package tb_olx_project;

import org.openqa.selenium.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final By HOME_CATEGORY_LINK = By.cssSelector("[class='css-cbwxzx']");
    private static final By KITCHEN_CATEGORY_LINK = By.cssSelector("[href*='posuda-kuhonnaya-utvar']");
    private static final By RUS_LANGUAGE_LINK = By.linkText("Рус");
    private static final By UKR_LANGUAGE_LINK = By.linkText("Укр");
    private static final By SEARCH_INPUT = By.id("search");
    private static final By CLEAR_BUTTON = By.cssSelector("[data-testid = 'clear-btn']");

    public void clickHomeCategoryLink() {
        waitForElement(HOME_CATEGORY_LINK);
        getDriver().findElement(HOME_CATEGORY_LINK).click();
    }

    public void clickKitchenCategoryLink() {
        waitForElement(KITCHEN_CATEGORY_LINK);
        getDriver().findElement(KITCHEN_CATEGORY_LINK).click();
    }

    public void clickRusLanguageLink()
    {
        waitForElement(RUS_LANGUAGE_LINK);
        getDriver().findElement(RUS_LANGUAGE_LINK).click();
    }

    public void clickUkrLanguageLink()
    {
        waitForElement(UKR_LANGUAGE_LINK);
        getDriver().findElement(UKR_LANGUAGE_LINK).click();
    }

    public String getRusLinkColor(){
        waitForElement(RUS_LANGUAGE_LINK);
        return getDriver().findElement(RUS_LANGUAGE_LINK).getCssValue("color");
    }

    public String getUkrLinkColor(){
        waitForElement(UKR_LANGUAGE_LINK);
        return getDriver().findElement(UKR_LANGUAGE_LINK).getCssValue("color");
    }

    public void clickSocialButton(String linkSelector){
        waitForElement(By.cssSelector(linkSelector));
        WebElement linkElement = getDriver().findElement(By.cssSelector(linkSelector));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", linkElement);
        linkElement.click();
    }

    public void enterSearchText(String textToSearch){
        waitForElement(SEARCH_INPUT);
        WebElement searchInput = getDriver().findElement(SEARCH_INPUT);
        searchInput.sendKeys(textToSearch, Keys.ENTER);
    }

    public void typeSearchText(String textToSearch){
        waitForElement(SEARCH_INPUT);
        WebElement searchInput = getDriver().findElement(SEARCH_INPUT);
        searchInput.sendKeys(textToSearch);
    }

    public String getSearchText(){
        waitForElement(SEARCH_INPUT);
        WebElement searchInput = getDriver().findElement(SEARCH_INPUT);
        return searchInput.getText();
    }

    public void clickClearButton(){
        waitForElement(CLEAR_BUTTON);
        getDriver().findElement(CLEAR_BUTTON).click();
    }
}


