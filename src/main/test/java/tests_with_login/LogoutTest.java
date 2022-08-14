package tests_with_login;

import pages.UserProfilePage;
import org.junit.Assert;
import org.junit.Test;

public class LogoutTest extends BaseTestWithLogin{

    public UserProfilePage userProfilePage;

    @Test

    public void logout() {

        userProfilePage = new UserProfilePage(driver);

        userProfilePage.logout();

        try {
            homePage.verifyLogout();
            System.out.println("User is loged out!");
        } catch (Exception e) {
            Assert.fail("User is not loged out!");
        }

    }
}
