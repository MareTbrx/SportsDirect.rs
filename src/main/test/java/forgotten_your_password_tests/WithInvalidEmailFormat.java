package forgotten_your_password_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class WithInvalidEmailFormat extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;

    @Test

    public void mydetails() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();

        logInPage.navtologinform();
        logInPage.passretreivalwithinvalidemailformat(PropertyManager.getInstance().getBadLoginEmailFormat());

        try{
            homePage.verifypassretreivalwithinvalidemailformat("Invalid Email Address");
            System.out.println("Password reset link NOT sent");
        }
        catch (Exception e){
            Assert.fail("Password reset link SENT");
        }
    }
}
