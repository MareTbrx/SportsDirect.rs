package RegistrationTest;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class WithoutFirstName extends BaseTest{

    public LogInPage logInPage;
    public HomePage homePage;
    public RegistrationPage registrationPage;
    @Test

    public void registration() {

        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);

        logInPage.basePage();

        String registrationData[] = FakeCredentials.createRegistrationData();

        logInPage.navtoregform();
        registrationPage.regformwithoutfirstname(registrationData);

        try {
            homePage.verifyRegWithoutFirstName("Please enter your first name");
            System.out.println("User is NOT Registered");
            PropertyManager.changeProperty("reg_password", registrationData[3]);
            PropertyManager.changeProperty("confirmpassword", registrationData[3]);
            PropertyManager.changeProperty("reglast_name", registrationData[1]);
            PropertyManager.changeProperty("regemail",registrationData[0] );

        }

        catch (Exception e) {
            Assert.fail("User IS registered");
        }


    }
}
