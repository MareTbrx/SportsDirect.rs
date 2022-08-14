package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage {

    public UserProfilePage(WebDriver driver){
        super(driver);
    }


    By profileiconmenuBy = By.id("topLinkMenu");
    By signoutbuttonBy = By.cssSelector(".SignOut.TopSubViewAll > a > .hidden-xs.logoutTxt");
    By mydetailspagenetryBy = By.xpath("/html//div[@id='main-content']/section[@id='main-content']/div/div/div/div/a[@href='/accountinformation/editpersonaldetails']");
    By accountdetailsbuttonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']//ul[@class='TopSubLinkMenu']//a[@href='/accountinformation']/span[@class='hidden-xs logoutTxt']");
    By contactpreferencesbuttonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']//ul[@class='TopSubLinkMenu']//a[@href='/accountinformation/contactpreferences']/span[@class='hidden-xs logoutTxt']");
    By wishlistdropdownbuttonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']//ul[@class='TopSubLinkMenu']//a[@href='/accountinformation/viewwishlist']/span[@class='hidden-xs logoutTxt']");
    By trackordersbuttonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']//ul[@class='TopSubLinkMenu']//a[@href='/accountinformation/orderhistorysummary']/span[@class='hidden-xs logoutTxt']");



    public UserProfilePage logout (){
        hover(profileiconmenuBy);
        click(signoutbuttonBy);
        return this;
    }

    public UserProfilePage mydetails (){
        click(profileiconmenuBy);
        click(mydetailspagenetryBy);
        return this;

    }
    public UserProfilePage accountdetails (){
        hover(profileiconmenuBy);
        click(accountdetailsbuttonBy);
        return this;
    }

    public UserProfilePage contactpreferences (){
        hover(profileiconmenuBy);
        click(contactpreferencesbuttonBy);
        return this;
    }

    public UserProfilePage wishlist () {
        hover(profileiconmenuBy);
        click(wishlistdropdownbuttonBy);
        return this;
    }

    public UserProfilePage trackorders () {
        hover(profileiconmenuBy);
        click(trackordersbuttonBy);
        return this;
    }
}
