package forgotten_your_password_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.UserProfilePage;
import utilities.PropertyManager;

public class LinkTest extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;

    @Test

    public void passwordforgot () {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();

        logInPage.navtologinform();
        logInPage.forgotyourpasslink();

        try{
            homePage.verifyforgotpasspage("Create a new password");
            System.out.println("Forgot yor pass link is OPENED");
        }
        catch (Exception e){
            Assert.fail("Forgot your pass link is NOT opened");
        }
    }


}
