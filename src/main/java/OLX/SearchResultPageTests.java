package OLX;

import aqa_hw_5.data_provider.SearchWordsData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchResultPageTests extends BaseTest {

    @Test  //(dataProvider = "getSearchWords", dataProviderClass = SearchWordsData.class)
    public void verifyPositiveSearchInput(String wordToSearch, String wordToVerify) {


        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(wordToSearch, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        List<WebElement> searchResult = getDriver().findElements(By.cssSelector("[class='css-1wxaaza']"));

        Assert.assertTrue(searchResult.get(3).getText().toLowerCase().contains(wordToVerify));

        Assert.assertTrue(searchResultText.isDisplayed());
    }

    @Test
    public void verifyNotPresentSearchInput() {

        final String SEARCH_PRODUCT_TEXT = "nnnnnnn";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        Assert.assertTrue(searchResultText.getText().contains(" 0 "));
    }

    @Test
    public void verifyEmptySearchInput() {

        final String SEARCH_PRODUCT_TEXT = " ";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        Assert.assertTrue(searchResultText.getText().contains(" 0 "));
    }

}



