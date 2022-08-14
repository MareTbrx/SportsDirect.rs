package profile_dropdown_menu;

import forgotten_your_password_tests.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.UserProfilePage;
import utilities.PropertyManager;

public class ContactPreferencesButton extends BaseTest {

    public HomePage homePage;
    public LogInPage logInPage;
    public UserProfilePage userProfilePage;

    @Test

    public void mydetails(){

        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        userProfilePage = new UserProfilePage(driver);

        logInPage.basePage();


        logInPage.login(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());
        userProfilePage.contactpreferences();

        try{
            homePage.verifycontactpreferencespage("Contact Preferences");
            System.out.println("Contact preferences page ENTERED");
        }
        catch (Exception e){
            Assert.fail("Contact preferences page is NOT entered");
        }

    }
}
