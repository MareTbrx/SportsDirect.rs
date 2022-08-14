package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ZoomItem extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;

    @Test

    public  void item(){

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        itemPage.navtoitem();
        itemPage.zoomitem();

        try{
            homePage.verifyzoomitem();
            System.out.println("Item is zoomed");
        }
        catch (Exception e){
            Assert.fail("Item is not zoomed");
        }
    }
}
