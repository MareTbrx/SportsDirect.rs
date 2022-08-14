package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class ClickSizeGuide extends BaseTest{

    public HomePage homePage;
    public ItemPage itemPage;
    public LogInPage logInPage;

    @Test


    public void item(){

        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();

        itemPage.navtoitem();
        itemPage.sizeguied();

        try{
        homePage.verifysizeguide("Please note that there can be some variance in the sizing standards used by various manufacturers.");
        System.out.println("Size guide page entered");
        }
        catch (Exception e){
            Assert.fail("Size guide page not entered");

        }
    }



}
