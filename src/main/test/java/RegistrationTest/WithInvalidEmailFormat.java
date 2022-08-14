package RegistrationTest;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class WithInvalidEmailFormat extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public RegistrationPage registrationPage;

    @Test

    public void registration() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        registrationPage = new RegistrationPage(driver);

        logInPage.basePage();

        String registrationData [] =FakeCredentials.createRegistrationData();

        logInPage.navtoregform();
        registrationPage.regformfillwithinvalidemailformat(registrationData);

        try{
            homePage.verifyRegWithInvalidEmailFormat("Please enter a valid email address");
            PropertyManager.changeProperty("reg_password", registrationData[3]);
            PropertyManager.changeProperty("confirmpassword", registrationData[3]);
            PropertyManager.changeProperty("regfirst_name", registrationData[2]);
            PropertyManager.changeProperty("reglast_name", registrationData[1]);
            PropertyManager.changeProperty("regemail",registrationData[4] );
            System.out.println("User is NOT registered");
        }

        catch (Exception e){
            Assert.fail("User IS registered");
        }


    }
}
