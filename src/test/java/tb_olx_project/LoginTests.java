package tb_olx_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    final static String RED_COLOR = "rgba(255, 86, 54, 1)";

    @Test(priority = 2)
    public void verifyInvalidLogin() {

        HomePage homePage = new HomePage();
        homePage.clickMessageLink();

        LoginPage loginPage = new LoginPage();

        loginPage.typeLoginInput("notestgmail");

        Assert.assertEquals(loginPage.getInvalidLoginMessage(), "Це не схоже на електронну пошту");
        Assert.assertEquals(loginPage.getInvalidLoginMessageColor(), RED_COLOR);
    }

    @Test(priority = 2)
    public void verifyInvalidPassword() {

        HomePage homePage = new HomePage();
        homePage.clickMessageLink();

        LoginPage loginPage = new LoginPage();

        loginPage.typePasswordInput("Secre");

        Assert.assertEquals(loginPage.getInvalidPasswordMessage(), "Ви впевнені, що це правильний пароль? Він надто короткий.");
        Assert.assertEquals(loginPage.getInvalidPasswordMessageColor(), RED_COLOR);
    }

    @Test(priority = 3)
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
