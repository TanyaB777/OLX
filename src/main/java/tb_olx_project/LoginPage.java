package tb_olx_project;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final String LOGIN_INPUT = "#username";
    private static final String PASSWORD_INPUT = "#password";
    private static final String SUBMIT_BUTTON = "button.css-ypypxs";
    private static final String INVALID_LOGIN_MESSAGE = ".css-1a74nwz .css-2t3wbf";
    private static final String INVALID_PASSWORD_MESSAGE = ".css-jl1cuj .css-2t3wbf";
    private static final String INCORRECT_LOGIN_MESSAGE = ".css-1iyoj2o .css-9pgvpt";
    private static final String RED_ERROR_ICON = ".css-1iv58re";

    public void typeLoginInput(String loginText) {
        $(LOGIN_INPUT).shouldBe(visible).setValue(loginText);
    }

    public void typePasswordInput(String passwordText) {
        $(PASSWORD_INPUT).shouldBe(visible).setValue(passwordText);
    }

    public String getInvalidLoginMessage() {
        return $(INVALID_LOGIN_MESSAGE).shouldBe(visible).getText();
    }

    public String getInvalidLoginMessageColor() {
        return $(INVALID_LOGIN_MESSAGE).shouldBe(visible).getCssValue("color");
    }

    public String getInvalidPasswordMessage() {
        return $(INVALID_PASSWORD_MESSAGE).shouldBe(visible).getText();
    }

    public String getInvalidPasswordMessageColor() {
        return $(INVALID_PASSWORD_MESSAGE).shouldBe(visible).getCssValue("color");
    }

    public void clickSubmitButton() {
        $(SUBMIT_BUTTON).shouldBe(visible).click();
    }

    public String getIncorrectLoginMessage() {
        return $(INCORRECT_LOGIN_MESSAGE).shouldBe(visible).getText();
    }

    public boolean checkRedErrorIconIsPresent() {
        return $(RED_ERROR_ICON).isDisplayed();
    }
}