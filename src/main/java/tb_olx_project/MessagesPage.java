package tb_olx_project;

import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MessagesPage {

    private static final String PAGE_HEADER = "[data-testid='header-title']";

    @Step("Get Message Page header.")
    public String getMessagePageHeader() {
        return $(PAGE_HEADER).shouldBe(visible, Duration.ofSeconds(20)).getText();
    }
}
