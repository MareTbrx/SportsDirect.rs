package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class TogglePicturesLeftRight extends BaseTest{

    public HomePage homePage;
    public ItemPage itemPage;
    public LogInPage logInPage;

    @Test

    public void item() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        itemPage.navtoitem();
        itemPage.togglepicturesleftright();

        try{
            homePage.verifypicturetoggle();
            System.out.println("Pictures are toggled");
        }
        catch (Exception e){
            Assert.fail("Pictures are not toggled");
        }
    }
}
