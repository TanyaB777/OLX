package tb_olx_project;

import tb_olx_project.listeners.CustomListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners(CustomListeners.class)
public class BaseTest {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void initializeDriver(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        driver.get("https://www.olx.ua");
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}

