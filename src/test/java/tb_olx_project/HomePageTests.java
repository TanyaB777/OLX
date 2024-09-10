package tb_olx_project;

import OLX.BaseTest;
import OLX.HomePage;
import OLX.ProductsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest{

        @Test(priority = 1)
        public void verifyProductCategoryShowing() {

            HomePage homePage = new HomePage(getDriver());

            homePage.clickHomeCategoryLink();
            homePage.clickHomeCategoryLink();

            ProductsPage productsPage = new ProductsPage(getDriver());

            Assert.assertTrue(productsPage.getProductSearchTitle());

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


}
