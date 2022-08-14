package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ReturnsButton extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;

    @Test

    public void item() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage. basePage();

        itemPage.navtoitem();
        itemPage.returns();

        try{
        homePage.verifyreturnstext("online returns page");
        System.out.println("Returns button is clicked");
        }
        catch (Exception e){
            Assert.fail("Returns button is not clicked");
        }
    }
}
