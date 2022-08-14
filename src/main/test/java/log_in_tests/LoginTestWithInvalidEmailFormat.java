package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import log_in_tests.BaseTest;
import utilities.PropertyManager;

public class LoginTestWithInvalidEmailFormat extends BaseTest {

    public HomePage homePage;
    public LogInPage loginPage;

    @Test
    public void failedLogin() {
        loginPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getBadLoginEmailFormat(),
                PropertyManager.getInstance().getPassword());

        try {


            homePage.verifyInvalidEmailLogin("The Email Address field is not a valid e-mail address.");
            System.out.println("User is NOT logged in");
        } catch (Exception e) {
            Assert.fail("User IS logged in");

        }
    }
}
