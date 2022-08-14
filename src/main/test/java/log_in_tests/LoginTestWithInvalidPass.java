package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import log_in_tests.BaseTest;
import utilities.PropertyManager;

public class LoginTestWithInvalidPass extends BaseTest {

    public HomePage homePage;
    public LogInPage loginPage;

    @Test
    public void failedLogin() {
        loginPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getEmail(),
                PropertyManager.getInstance().getBadLoginPassword());

        try {


            homePage.verifyFailedLogin("This email address or password is incorrect");
            System.out.println("User is NOT logged in");
        } catch (Exception e) {
            Assert.fail("User IS logged in");

        }
    }
}
