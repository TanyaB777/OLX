package tb_olx_project;

import com.codeborne.selenide.WebDriverRunner;
import tb_olx_project.listeners.CustomListeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.open;

@Listeners(CustomListeners.class)
public class BaseTest {

    @BeforeMethod
    public void initializeDriver() {
        open("https://www.olx.ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}