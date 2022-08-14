package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class LoginTestWithInvalidEmail extends BaseTest{

    HomePage homePage;
    LogInPage logInPage;

    @Test

    public void failedLogin(){

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);


        logInPage.basePage();
        logInPage.login(PropertyManager.getInstance().getIncorrect_login_email(), PropertyManager.getInstance().getPassword());

        try{
            homePage.verifyFailedLogin("This email address or password is incorrect");
            System.out.println("User is NOT logged in");
        }
        catch(Exception e){
            Assert.fail("User IS logged in");
        }
    }
}
