package tb_olx_project;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tb_olx_project.olx_data_provider.OLXDataProvider;

import java.util.Set;

import static com.codeborne.selenide.Selenide.switchTo;

public class SocialMediaTests extends BaseTest {

    @Test(dataProvider = "getSocialMedia", dataProviderClass = OLXDataProvider.class)
    @Description("Verification of social media link openings")
    @Severity(SeverityLevel.TRIVIAL)
    @Feature("Social media links")
    public void testLinkOpensInNewTab(String expectedUrlPart, String linkSelector) {
        String originalWindow = WebDriverRunner.getWebDriver().getWindowHandle();

        HomePage homePage = new HomePage();
        homePage.clickSocialButton(linkSelector);

        Set<String> allWindows = WebDriverRunner.getWebDriver().getWindowHandles();
        boolean siteFound = false;

        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                switchTo().window(window);
                String newTabUrl = WebDriverRunner.url();

                if (newTabUrl.contains(expectedUrlPart)) {
                    siteFound = true;
                    break;
                }
            }
        }

        switchTo().window(originalWindow);

        Assert.assertTrue(siteFound);
    }
}