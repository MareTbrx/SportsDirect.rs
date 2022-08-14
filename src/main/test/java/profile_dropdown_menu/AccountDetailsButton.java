package profile_dropdown_menu;

import forgotten_your_password_tests.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.UserProfilePage;
import utilities.PropertyManager;

public class AccountDetailsButton extends BaseTest {

    public HomePage homePage;
    public LogInPage logInPage;
    public UserProfilePage userProfilePage;

    @Test

    public void mydetails () {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        userProfilePage = new UserProfilePage(driver);

        logInPage.basePage();

        logInPage.login(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());
        userProfilePage.accountdetails();

        try{

            homePage.verifyaccountdetailspage("Account Details");
            System.out.println("Account details page ENTERED");
        }
        catch(Exception e){
            Assert.fail("Account details page NOT entered");
        }

    }
}
