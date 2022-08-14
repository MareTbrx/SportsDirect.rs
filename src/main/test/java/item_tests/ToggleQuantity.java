package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ToggleQuantity extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;

    @Test

    public void item () {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        itemPage.navtoitem();
        itemPage.togglequantity();

        try{
            homePage.verifytogglequantity("2");
            System.out.println("Quantity is changed");
        }
        catch (Exception e){
            Assert.fail("Quantity is not changed");
        }



    }
}
