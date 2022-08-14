package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;
import utilities.FakeCredentials;
import utilities.PropertyManager;

public class EnterQuantity extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;


    @Test

    public void item()  {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        String quantityData[] = FakeCredentials.createRegistrationData();

        itemPage.navtoitem();
        itemPage.enterquantity(quantityData);

        try{
            homePage.verifyenteredquantity();
            System.out.println("Correct quantity is entered");
            PropertyManager.changeProperty("quantity", quantityData[7]);
        }
        catch(Exception e){
            Assert.fail("Incorrect value is entered");
        }

    }
}
