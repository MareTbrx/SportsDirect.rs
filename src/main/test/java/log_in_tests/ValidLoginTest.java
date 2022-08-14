package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LogInPage;
import log_in_tests.BaseTest;
import utilities.PropertyManager;

public class ValidLoginTest extends BaseTest {

    public HomePage homePage;
    public LogInPage logInPage;

    @Test

    public void login() {

        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);


        logInPage.basePage();
        logInPage.login(PropertyManager.getInstance().getEmail(),
                PropertyManager.getInstance().getPassword());

        try {


            homePage.verifyLogin("Account details");
            System.out.println("User IS logedin!");
        } catch (Exception e) {
            Assert.fail("User is NOT logedin!");

        }
    }

}
