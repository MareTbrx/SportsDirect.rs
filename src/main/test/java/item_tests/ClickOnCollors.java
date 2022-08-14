package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ClickOnCollors extends BaseTest{

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
        itemPage.clickoncollors();

        try{
            homePage.verifyclickoncollors("Grey/Red");
            System.out.println("Colors are clicked");
        }
        catch (Exception e){
            Assert.fail("Colors are not clicked");
        }
    }
}
