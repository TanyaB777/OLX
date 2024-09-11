package tb_olx_project;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {

    @Test(priority = 1)
    public void verifyProductCategoryShowing() {

        HomePage homePage = new HomePage(getDriver());

        homePage.clickHomeCategoryLink();
        homePage.clickKitchenCategoryLink();

        ProductsPage productsPage = new ProductsPage(getDriver());

        Assert.assertTrue(productsPage.checkProductSearchTitle());

        List<WebElement> searchResult = productsPage.getProductsItems();

        for (WebElement element : searchResult) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Test(priority = 2)
    public void verifyLanguageChange() {

        String whiteColor = "rgba(255, 255, 255, 1)";

        HomePage homePage = new HomePage(getDriver());

        homePage.clickRusLanguageLink();

        assertTrue(homePage.getUkrLinkColor().contains(whiteColor));
    }

    @Test(priority = 3)
    public void verifySearchFilterClear() {

        String textForSearchType = "Test text";

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchText(textForSearchType);
        homePage.clickClearButton();

        assertTrue(homePage.getSearchText().isEmpty());
    }
}
