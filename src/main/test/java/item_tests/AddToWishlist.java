package item_tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;
import utilities.PropertyManager;

public class AddToWishlist extends BaseTest{

    public HomePage homePage;
    public LogInPage logInPage;
    public ItemPage itemPage;

    @Test

    public  void item(){

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        itemPage = new ItemPage(driver);

        logInPage.basePage();

        logInPage.login(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());
        itemPage.navtoitemforwishlist();
        itemPage.addtowishlist();

        try{
            homePage.verifyaddtowishlist();
            System.out.println("Item is added to wishlist");
        }
        catch (Exception e){
            Assert.fail("Item is not added to wishlist");
        }

}}
