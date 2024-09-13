package tb_olx_project;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import tb_olx_project.olx_data_provider.OLXDataProvider;

public class SocialMediaTests extends BaseTest {

    @Test(dataProvider = "getSocialMedia", dataProviderClass = OLXDataProvider.class)
    public void testLinkOpensInNewTab(String expectedUrl, String linkSelector) {

        HomePage homePage = new HomePage();
        homePage.clickSocialButton(linkSelector);

        String originalWindow = WebDriverRunner.getWebDriver().getWindowHandle();

        switchTo().window(1);

        String newTabUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        boolean siteFound = newTabUrl.contains(expectedUrl);

        switchTo().window(originalWindow);

        Assert.assertTrue(siteFound);
    }
}