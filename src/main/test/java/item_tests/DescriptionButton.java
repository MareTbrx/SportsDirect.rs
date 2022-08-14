package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class DescriptionButton extends BaseTest{

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
        itemPage.description();

        try{
        homePage.verifydescriptiontext("Collection");
        System.out.println("Description button is clicked");
        }
        catch (Exception e){
            Assert.fail("Description button is not clicked");
        }
    }
}
