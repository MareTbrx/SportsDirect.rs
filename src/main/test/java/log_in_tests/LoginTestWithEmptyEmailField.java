package log_in_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import log_in_tests.BaseTest;
import utilities.PropertyManager;

public class LoginTestWithEmptyEmailField extends BaseTest {

     public HomePage homePage;
     public LogInPage logInPage;

     @Test

    public void failedLogin(){

         homePage = new HomePage(driver);
         logInPage = new LogInPage(driver);

         logInPage.basePage();
         logInPage.login(PropertyManager.getInstance().getEmpty_email_field(), PropertyManager.getInstance().getPassword());

         try {


             homePage.verifyEmptyEmailField("Please provide an email address");
             System.out.println("User is NOT logged in");
         } catch (Exception e) {
             Assert.fail("User IS logged in");

         }
     }
}
