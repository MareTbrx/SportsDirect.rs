package forgotten_your_password_tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup (){
        options = new ChromeOptions();
        // Disables Browser pop ups. They can make test not run.
        options.addArguments("--disable-notifications");


        System.setProperty("webdriver.chrome.driver",
        PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
