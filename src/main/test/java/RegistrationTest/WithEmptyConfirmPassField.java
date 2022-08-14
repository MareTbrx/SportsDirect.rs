package RegistrationTest;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class WithEmptyConfirmPassField extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public RegistrationPage registrationPage;

    @Test

    public void registration(){

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        registrationPage = new RegistrationPage(driver);

        logInPage.basePage();

        String [] registrationData = FakeCredentials.createRegistrationData();

        logInPage.navtoregform();
        registrationPage.regformwithoutconfirmedpass(registrationData);

        try{
            homePage.verifyRegWithoutConfirmedPass("Please re-enter your password");
            System.out.println("User is NOT registered");
            PropertyManager.changeProperty("reg_password", registrationData[3]);
            PropertyManager.changeProperty("regfirst_name", registrationData[2]);
            PropertyManager.changeProperty("reglast_name", registrationData[1]);
            PropertyManager.changeProperty("regemail",registrationData[0] );
        }
        catch (Exception e){
            Assert.fail("User IS registered");
        }
    }
}
