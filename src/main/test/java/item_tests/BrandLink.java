package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class BrandLink extends BaseTest{

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
        itemPage.brandlink();

        try{
        homePage.verifybrandlink("All Nike");
        System.out.println("Brand link page entered");
        }
        catch(Exception e){
            Assert.fail("Brand link page not entered");
        }
    }
}
