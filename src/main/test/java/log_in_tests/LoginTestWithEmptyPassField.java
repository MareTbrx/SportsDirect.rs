package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class LoginTestWithEmptyPassField extends BaseTest{

    public HomePage homepage;
    public LogInPage logInPage;

    @Test
    public void failedLogin() {
        logInPage = new LogInPage(driver);
        homepage = new HomePage(driver);

        logInPage.basePage();
        logInPage.login(PropertyManager.getInstance().getEmail(),PropertyManager.getInstance().getEmpty_pass_field() );

        try {


            homepage.verifyEmptyPassField("Please provide a password");
            System.out.println("User is NOT logged in");
        } catch (Exception e) {
            Assert.fail("User IS logged in");

        }


    }
    }


