package OLX;

import OLX.DP_OLX.DataProviderOLX;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertTrue;

import java.util.Set;

public class SocialMedia {

    @Test(dataProvider = "getSocialMedia", dataProviderClass = DataProviderOLX.class)
    public void testLinkOpensInNewTab(String s1, String s2) {

        String siteForNavigateURL = s1;

        open("https://www.olx.ua/");

        String originalWindow = getWebDriver().getWindowHandle();

        $(By.cssSelector(s2)).scrollTo().click();

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
