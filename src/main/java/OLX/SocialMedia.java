package OLX;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertTrue;

import java.util.Set;

public class SocialMedia {

    @Test
    public void testLinkOpensInNewTab() {

        String siteForNavigateURL = "https://www.facebook.com/olx.ua";

        open("https://www.olx.ua/");

        String originalWindow = getWebDriver().getWindowHandle();

        $(By.cssSelector("[data-testid='facebook']")).scrollTo().click();

        Set<String> allWindows = getWebDriver().getWindowHandles();

        boolean siteFind = false;

        try {
            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    getWebDriver().switchTo().window(window);

                    String newTabUrl = getWebDriver().getCurrentUrl();

                    if (newTabUrl.contains(siteForNavigateURL)) {
                        siteFind = true;
                        break;
                    }
                }
            }
        } finally {
            getWebDriver().switchTo().window(originalWindow);
        }

        assertTrue(siteFind);
        getWebDriver().close();
    }


}
