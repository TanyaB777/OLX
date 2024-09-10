package OLX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final By HOME_CATEGORY_LINK = By.cssSelector("[class='css-cbwxzx']");
    private static final By KITCHEN_CATEGORY_LINK = By.cssSelector("[href*='posuda-kuhonnaya-utvar']");
    private static final By RUS_LANGUAGE_LINK = By.linkText("Рус");
    private static final By UKR_LANGUAGE_LINK = By.linkText("Укр");


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
}