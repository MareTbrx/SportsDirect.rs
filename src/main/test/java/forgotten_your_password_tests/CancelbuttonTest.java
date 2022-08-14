package forgotten_your_password_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;

public class CancelbuttonTest extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;

    @Test

    public void mydetails(){

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();

        logInPage.navtologinform();
        logInPage.passretreivalcancelbutton();

        try{
            homePage.verifycancelbuttonBy("Sign In Securely");
            System.out.println("Cancel successful");
        }
        catch (Exception e){
            Assert.fail("Cancel unsuccessful");
        }
    }
}
