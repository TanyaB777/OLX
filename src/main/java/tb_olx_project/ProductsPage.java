package tb_olx_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final By PRODUCT_SEARCH_TITLE = By.cssSelector("[data-testid='total-count']");
    private static final By PRODUCT_ITEMS = By.cssSelector("[class='css-1wxaaza']");

    public boolean getProductSearchTitle() {
        waitForElement(PRODUCT_SEARCH_TITLE);
        return getDriver().findElement(PRODUCT_SEARCH_TITLE).isDisplayed();
    }

    public List<WebElement>  getProductsItems() {
        waitForElement(PRODUCT_ITEMS);
        return getDriver().findElements(PRODUCT_ITEMS);
    }
}

