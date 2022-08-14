package forgotten_your_password_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.UserProfilePage;
import utilities.PropertyManager;

public class WithValidEmail extends BaseTest {

    public HomePage homePage;
    public LogInPage logInPage;


    @Test

    public void mydetails () {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();

        logInPage.navtologinform();
        logInPage.passretreivalwithvalidemail(PropertyManager.getInstance().getRegemail());

        try{
            homePage.verifypassretreival("If the email address entered was correct, you should receive a new email shortly with a link to reset your password.");
            System.out.println("Password reset link SENT");
        }
        catch(Exception e){
            Assert.fail("Password reset link is NOT sent");
        }

    }

}
