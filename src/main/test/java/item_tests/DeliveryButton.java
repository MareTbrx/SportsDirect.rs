package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class DeliveryButton extends BaseTest{

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
        itemPage.delivery();

        try{
            homePage.verifydeliverytext("Standard Delivery");
            System.out.println("Delivery button is clicked");
        }
        catch (Exception e){
            Assert.fail("Delivery button is not clicked");
        }
    }
}
