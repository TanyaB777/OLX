package tb_olx_project;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    private static final String PRODUCT_SEARCH_TITLE = "[data-testid='total-count']";
    private static final String PRODUCT_ITEMS = "[class='css-1wxaaza']";

    public boolean checkProductSearchTitle() {
        return $(PRODUCT_SEARCH_TITLE).shouldBe(visible).isDisplayed();
    }

    public String getProductSearchTitle() {
        return $(PRODUCT_SEARCH_TITLE).shouldBe(visible).getText();
    }

    public ElementsCollection getProductsItems() {
        return $$(PRODUCT_ITEMS);
    }
}