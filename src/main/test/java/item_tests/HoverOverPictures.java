package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class HoverOverPictures extends BaseTest{

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
        itemPage.hoverpictures();

        try{
            homePage.verifypictureshover();
            System.out.println("All pictures HOVERED");
        }
        catch (Exception e){
            Assert.fail("All pictures are not HOVERED");
        }





    }


}
