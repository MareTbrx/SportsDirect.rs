package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.UserProfilePage;

public class CorrectUserLoggedinTest extends BaseTestWithLogin{

    public UserProfilePage userProfilePage;

    @Test

    public void mydetails () {

        userProfilePage = new UserProfilePage(driver);
        userProfilePage.mydetails();

        try{
            homePage.verifyUser( "Vuksanovic");
            System.out.println("Correct user IS logged in");
        }
        catch (Exception e){
            Assert.fail("Correct iser is NOT logged in");
        }
    }
}
