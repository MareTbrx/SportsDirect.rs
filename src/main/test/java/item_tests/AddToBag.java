package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class AddToBag extends BaseTest{

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
        itemPage.addtobag();

        try{
        homePage.verifyaddtobag();
        System.out.println("Item is added to the bag");
        }
        catch (Exception e){
            Assert.fail("Item is not added to the bag");
        }
    }
}
