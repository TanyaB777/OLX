package tb_olx_project;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    final static String RED_COLOR = "rgba(255, 86, 54, 1)";

    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    @Description("Verify that an invalid login email displays the correct error message and message color.")
    @Feature("Login")
    public void verifyInvalidLogin() {
        HomePage homePage = new HomePage();
        homePage.clickMessageLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeLoginInput("notestgmail");

        Assert.assertEquals(loginPage.getInvalidLoginMessage(), "Це не схоже на електронну пошту");
        Assert.assertEquals(loginPage.getInvalidLoginMessageColor(), RED_COLOR);
    }

    @Test(priority = 2)
    @Description("Verify that an invalid password displays the correct error message and message color.")
    @Feature("Login")
    public void verifyInvalidPassword() {
        HomePage homePage = new HomePage();
        homePage.clickMessageLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typePasswordInput("Secre");

        Assert.assertEquals(loginPage.getInvalidPasswordMessage(), "Ви впевнені, що це правильний пароль? Він надто короткий.");
        Assert.assertEquals(loginPage.getInvalidPasswordMessageColor(), RED_COLOR);
    }

    @Test(priority = 3)
    @Description("Verify that entering incorrect login credentials displays the correct error message and shows a red error icon.")
    @Feature("Login")
    public void verifyIncorrectLogin() {
        HomePage homePage = new HomePage();
        homePage.clickMessageLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeLoginInput("notest@gmail.com");
        loginPage.typePasswordInput("Secret1sauce");
        loginPage.clickSubmitButton();

        Assert.assertEquals(loginPage.getIncorrectLoginMessage(), "Ми не знайшли профіль із цією адресою електронної пошти. Повторіть спробу, використовуючи іншу адресу, або створіть профіль.");
        Assert.assertTrue(loginPage.checkRedErrorIconIsPresent());
    }
}