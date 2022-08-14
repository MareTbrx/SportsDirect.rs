package RegistrationTest;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class WithoutLastName extends BaseTest{

    public LogInPage logInPage;
    public HomePage homePage;
    public RegistrationPage registrationPage;

    @Test

    public void registration(){

        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage (driver);

        logInPage.basePage();

        String registrationData [] = FakeCredentials.createRegistrationData();

        logInPage.navtoregform();
        registrationPage.regformwithoutlastname(registrationData);

        try {
            homePage.verifyRegWithoutLastName("Please enter your last name");
            System.out.println("User is NOT Registered");
            PropertyManager.changeProperty("reg_password", registrationData[3]);
            PropertyManager.changeProperty("confirmpassword", registrationData[3]);
            PropertyManager.changeProperty("regfirst_name", registrationData[2]);
            PropertyManager.changeProperty("regemail",registrationData[0] );
        }
        catch (Exception e){
            Assert.fail("User IS registered");
        }
    }

}
