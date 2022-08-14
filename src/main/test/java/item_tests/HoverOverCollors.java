package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class HoverOverCollors extends BaseTest{

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
        itemPage.hoverovercollors();

        try{
            homePage.verifyhoverovercollors("Grey/Red");
            System.out.println("Collor are hovered");
        }
        catch (Exception e){
            Assert.fail("Collors are not hovered");
        }

    }
}
