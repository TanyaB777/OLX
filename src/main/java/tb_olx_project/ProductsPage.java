package tb_olx_project;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    private static final String PRODUCT_SEARCH_TITLE = "[data-testid='total-count']";
    private static final String PRODUCT_ITEMS = "[class='css-1wxaaza']";

    @Step("Check if the product search title is displayed")
    public boolean checkProductSearchTitle() {
        return $(PRODUCT_SEARCH_TITLE).shouldBe(visible).isDisplayed();
    }

    @Step("Get the text of the product search title")
    public String getProductSearchTitle() {
        return $(PRODUCT_SEARCH_TITLE).shouldBe(visible).getText();
    }

    @Step("Get the list of product items")
    public ElementsCollection getProductsItems() {
        return $$(PRODUCT_ITEMS);
    }
}