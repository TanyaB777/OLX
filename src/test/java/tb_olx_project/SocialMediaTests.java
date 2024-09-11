package tb_olx_project;

import org.testng.Assert;
import org.testng.annotations.Test;
import tb_olx_project.olx_data_provider.OLXDataProvider;

import java.util.Set;

public class SocialMediaTests extends BaseTest{

    @Test(dataProvider = "getSocialMedia", dataProviderClass = OLXDataProvider.class)
    public void testLinkOpensInNewTab (String expectedUrlPart, String linkSelector) {

        String originalWindow = getDriver().getWindowHandle();

        HomePage homePage = new HomePage(getDriver());
        homePage.clickSocialButton(linkSelector);

        Set<String> allWindows = getDriver().getWindowHandles();
        boolean siteFound = false;

        try {
            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    getDriver().switchTo().window(window);
                    String newTabUrl = getDriver().getCurrentUrl();

                    if (newTabUrl.contains(expectedUrlPart)) {
                        siteFound = true;
                        break;
                    }
                }
            }
        } finally {
            getDriver().switchTo().window(originalWindow);
        }

        Assert.assertTrue(siteFound);
    }
}


