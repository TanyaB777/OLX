package tb_olx_project;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {

    @Test(priority = 2)
    public void verifyProductCategoryShowing() {

        HomePage homePage = new HomePage();
        homePage.clickHomeCategoryLink();
        homePage.clickKitchenCategoryLink();

        ProductsPage productsPage = new ProductsPage();
        assertTrue(productsPage.checkProductSearchTitle());

        ElementsCollection searchResult = productsPage.getProductsItems();

        searchResult.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    @Test(priority = 1)
    public void verifyLanguageChange() {

        String whiteColor = "rgba(255, 255, 255, 1)";

        HomePage homePage = new HomePage();

        homePage.clickRusLanguageLink();

        Assert.assertTrue(homePage.getUkrLinkColor().contains(whiteColor));
    }

    @Test(priority = 3)
    public void verifySearchFilterClear() {

        String textForSearchType = "Test text";

        HomePage homePage = new HomePage();

        homePage.typeSearchText(textForSearchType);
        homePage.clickClearButton();

        Assert.assertTrue(homePage.getSearchText().isEmpty());
    }
}
