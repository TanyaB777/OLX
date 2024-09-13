package tb_olx_project;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;
import tb_olx_project.olx_data_provider.OLXDataProvider;

public class SearchResultPageTests extends BaseTest {

    @Test(dataProvider = "getSearchWords", dataProviderClass = OLXDataProvider.class)
    public void verifyPositiveSearchInput(String textToSearch, String textToVerify) {

        HomePage homePage = new HomePage();
        homePage.enterSearchText(textToSearch);

        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.checkProductSearchTitle());

        ElementsCollection searchResult = productsPage.getProductsItems();

        Assert.assertTrue(searchResult.get(3).getText().toLowerCase().contains(textToVerify.toLowerCase()));
    }

    @Test
    public void verifyNotPresentSearchInput() {

        final String SEARCH_PRODUCT_TEXT = "nnnnnnn";

        HomePage homePage = new HomePage();
        homePage.enterSearchText(SEARCH_PRODUCT_TEXT);

        ProductsPage productsPage = new ProductsPage();

        Assert.assertTrue(productsPage.getProductSearchTitle().contains(" 0 "));
    }

    @Test
    public void verifyEmptySearchInput() {

        final String SEARCH_PRODUCT_TEXT = " ";

        HomePage homePage = new HomePage();
        homePage.enterSearchText(SEARCH_PRODUCT_TEXT);

        ProductsPage productsPage = new ProductsPage();

        Assert.assertTrue(productsPage.getProductSearchTitle().contains(" 0 "));
    }
}



