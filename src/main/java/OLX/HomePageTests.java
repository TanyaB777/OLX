import OLX.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {

    @Test(priority = 1)
    public void verifyProductCategoryShowing() {

        final Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5)).withMessage("Element was not found");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='css-cbwxzx']")));

        WebElement gardenItem = getDriver().findElement(By.cssSelector("[class='css-cbwxzx']"));
        gardenItem.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[href*='posuda-kuhonnaya-utvar']")));

        WebElement gardenSubItem = getDriver().findElement(By.cssSelector("[href*='posuda-kuhonnaya-utvar']"));
        gardenSubItem.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='css-1wxaaza']")));
        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        assertTrue(searchResultText.isDisplayed());

        List<WebElement> searchResult = getDriver().findElements(By.cssSelector("[class='css-1wxaaza']"));

        for (WebElement element : searchResult) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Test(priority = 2)
    public void verifyLanguageChange() {

        String whiteColor = "rgba(255, 255, 255, 1)";

        WebElement rusLanguageItem = getDriver().findElement(By.linkText("Рус"));
        rusLanguageItem.click();

        WebElement ukrLanguageItem = getDriver().findElement(By.linkText("Укр"));
        String itemColor = ukrLanguageItem.getCssValue("color");

        assertTrue(itemColor.contains(whiteColor));
    }
}
