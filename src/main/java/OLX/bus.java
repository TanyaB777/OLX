package OLX;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class bus {

    @Test
    public void testLinkOpensInNewTab1() {

        open("https://www.olx.ua/");

        String originalWindow = getWebDriver().getWindowHandle();

        SelenideElement el1 = $(By.cssSelector(".css-1yw000u"));

        sleep(15000);

        el1.scrollTo();
        el1.shouldBe(visible).click();

        Set<String> windowHandles = getWebDriver().getWindowHandles();

        for (String windowHandle : windowHandles) {
            getWebDriver().switchTo().window(windowHandle);
            if (getWebDriver().getTitle().equals("Название вашей страницы")) {
                break;
            }
        }

        SelenideElement el2 = $(By.cssSelector(".first-screen-section .consultation-btn"));

        assertTrue(el2.shouldBe(visible).isDisplayed());

    }
}
