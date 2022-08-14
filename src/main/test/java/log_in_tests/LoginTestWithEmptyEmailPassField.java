package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class LoginTestWithEmptyEmailPassField extends BaseTest{

    public LogInPage logInPage;
    public HomePage homePage;

    @Test
    public void failedLogin(){

        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.basePage();
        logInPage.login(PropertyManager.getInstance().getEmpty_email_field(), PropertyManager.getInstance().getEmpty_pass_field());

        try {

            homePage.verifyEmptyPassEmailField("Please provide an email address","Please provide a password");
            System.out.println("User is NOT logged in");
        }
        catch (Exception e) {
            Assert.fail("User IS logged in");
        }
    }
}
