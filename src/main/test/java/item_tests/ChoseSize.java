package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ChoseSize extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;

    @Test

    public void item() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        itemPage.navtoitem();
        itemPage.chosesize();

        try {
            homePage.verifychosensize("13 (48.5)");
            System.out.println("Size is chosen");
        }
        catch(Exception e){
            Assert.fail();
        }
    }
}
