package RegistrationTest;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class Valid extends BaseTest {
    public LogInPage loginpage;
    public HomePage homepage;
    public RegistrationPage registrationpage;

    @Test

    public void registration () {
        loginpage = new LogInPage(driver);
        homepage = new HomePage(driver);
        registrationpage = new RegistrationPage(driver);


        loginpage.basePage();

        String registrationData[] = FakeCredentials.createRegistrationData();




        loginpage.navtoregform();
        registrationpage.regformfill(registrationData);

        try {


            homepage.verifyRegistration("Account details");
            System.out.println("User IS registered!");
            PropertyManager.changeProperty("reg_password", registrationData[3]);
            PropertyManager.changeProperty("confirmpassword", registrationData[3]);
            PropertyManager.changeProperty("regfirst_name", registrationData[2]);
            PropertyManager.changeProperty("reglast_name", registrationData[1]);
            PropertyManager.changeProperty("regemail",registrationData[0] );
        } catch (Exception e) {
            Assert.fail("Registration failed!");

        }

    }
}
