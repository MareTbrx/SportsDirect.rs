package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super (driver);
    }
    By errorNotificationBy = By.xpath("//span[@class='dnnFormMessage dnnFormValidationSummary field-validation-error']");
    By saleButtonBy = By.id("lnkTopLevelMenu_2624418");

    By firstNameBoxBy = By.id("txtFirstName");
    By lastNameBoxBy = By.id("txtLastName");
    By invalidEmailNotificationBy = By.id("Login_EmailAddress-error");
    By emptyPassFieldNotificationBy = By.id("Login_Password-error");
    By emptyEmailFieldNotificationBy = By.id("Login_EmailAddress-error");
    By profileMenuButtonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']/li/a[@href='/accountinformation']");
    By accountDetailsButtonBy = By.xpath("/html//nav[@id='topLinkMenu']/ul[@class='TopLinkMenu']//ul[@class='TopSubLinkMenu']//a[@href='/accountinformation']/span[@class='hidden-xs logoutTxt']");
    By regfirstnameerrorBy = By.id("Registration_FirstName-error");
    By reglastnameerrorBy = By.id("Registration_LastName-error");
    By regemailerrorBy = By.id("Registration_EmailAddress-error");
    By regpasserrorBy = By.id("txtPassword-error");
    By confirmedpasserrorBy = By.id("Registration_ConfirmPassword-error");
    By dateofbirtherrorBy = By.xpath("/html//div[@id='dnnManageUsers']//span[.='Date of Birth is not valid']");
    By accountdetailstextBy = By.xpath("//div[@id='accountHeader']//h1[.='Account Details']");
    By contactpreferencestextBy = By.xpath("//div[@id='accountHeader']//h1[.='Contact Preferences']");
    By viewwishlisttextBy = By.xpath("//div[@id='accountHeader']//h1[.='View Wish List']");
    By trackorderstextBy = By.xpath("//div[@id='accountHeader']//h1[.='Order History Summary']");
    By createnewpasstextBy = By.cssSelector("h1");
    By passretreivalmessageBy = By.cssSelector(".dnnFormMessage.dnnFormSuccess");
    By emailadresserrorBy = By.id("EmailAddress-error");
    By loginbuttonBy = By.id("LoginButton");
    By picture5By = By.xpath("//ul[@id='piThumbList']//a[@href='https://images.sportsdirect.com/images/products/id12126140_l_a4.jpg']/img[@alt='Black/Wht/Grey - Nike - Air Max Invigor Trainers Mens']");
    By picture2By = By.xpath("/html//img[@id='imgProduct']");
    By collortextBy = By.id("colourName");
    By fourthteenthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[14]/a[@id='ancLink']");
    By quantityfieldBy = By.id("ProductQty");
    By zoomeditem = By.id("imgProductZoom");
    By sliderBy = By.id("slider");
    By wishlistcountBy = By.id("lblWishListCount");
    By chartstextBy = By.cssSelector(".noteSize");
    By collectiontextBy = By.xpath("//ul[@id='DisplayAttributes']/li[1]/span[@class='feature-name']");
    By standarddeliverytextBy = By.xpath("/html//div[@id='divDeliveryTab']//strong[.='Standard Delivery']");
    By returnstextBy = By.cssSelector(".returnsGroup p:nth-of-type(2) [href]");
    By allnikebuttonBy = By.cssSelector(".boldText.slideName.viewAll");
    By baggquantityfiledBy = By.id("bagQuantity");
    By togglepicturesdown = By.cssSelector("span#sNextImg > .glyphicon.glyphicon-circle-arrow-right");
    By picture4By = By.id("piThumb4_piThumbImg");
    By signinoptionBy = By.cssSelector("div#divSignIn > a[title='Sign In']");




    public HomePage verifyFailedLogin(String expectedText){
        String alert = readText(errorNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public HomePage verifyInvalidEmailLogin(String expectedText){
        String alert = readText(invalidEmailNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public HomePage verifyEmptyPassField(String expectedText){
        String alert = readText(emptyPassFieldNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public HomePage verifyEmptyEmailField(String expectedText) {
        String alert = readText(emptyEmailFieldNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }

    public HomePage verifyEmptyPassEmailField(String expectedText1, String expectedText2){
        String alert1 = readText(emptyEmailFieldNotificationBy);
        assertStringEquals(alert1, expectedText1);
        String alert2 = readText(emptyPassFieldNotificationBy);
        assertStringEquals(alert2, expectedText2);
        return this;
    }
    public HomePage verifyLogin (String expectedText){
        hover(profileMenuButtonBy);
        String profilemenu = readText(accountDetailsButtonBy);
        assertStringEquals(profilemenu, expectedText);
        return this;
    }

    public HomePage verifyRegistration (String expectedText){
        hover(profileMenuButtonBy);
        String profilemenu = readText(accountDetailsButtonBy);
        assertStringEquals(profilemenu, expectedText);
        return this;
    }

    public HomePage verifyLogout (){
        displayed(signinoptionBy);
        return this;
    }

    public HomePage verifyUser (String expectedValue){
        String LastName = readValue (lastNameBoxBy);
        assertStringEquals(LastName, expectedValue);
        return this;
    }

    public HomePage verifyRegWithoutFirstName(String expectedText){
        String FirstName = readText(regfirstnameerrorBy);
        assertStringEquals(FirstName, expectedText);
        return this;
    }

    public HomePage verifyRegWithoutLastName (String expectedText){
        String LastName = readText(reglastnameerrorBy);
        assertStringEquals(LastName, expectedText);
        return this;
    }
    public HomePage verifyRegWithoutEmail (String expectedText){
        String Email = readText(regemailerrorBy);
        assertStringEquals(Email, expectedText);
        return this;
    }
    public HomePage verifyRegWithoutPass (String expectedText){
        String Password = readText(regpasserrorBy);
        assertStringEquals(Password, expectedText);
        return this;
    }
    public HomePage verifyRegWithoutConfirmedPass (String expectedText){
        String ConfirmedPass = readText(confirmedpasserrorBy);
        assertStringEquals(ConfirmedPass, expectedText);
        return this;
    }

    public HomePage verifyRegWithInvalidEmailFormat (String expectedText){
        String InvalidFormatEmail = readText(regemailerrorBy);
        assertStringEquals(InvalidFormatEmail, expectedText);
        return this;
    }
    public HomePage verifyRegWithPassNotMatching (String expectedText){
        String PassNotMatching = readText(confirmedpasserrorBy);
        assertStringEquals(PassNotMatching, expectedText);
        return this;
    }

    public HomePage verifyRegWithPassUnderMinimumChar (String expectedText){
        String PassUnderMinimum = readText(regpasserrorBy);
        assertStringEquals(PassUnderMinimum, expectedText);
        return this;
    }

    public HomePage verifyRegWithInvalidDateOfBirth (String expectedText){
        String InvalidDateOfBirth = readText(dateofbirtherrorBy);
        assertStringEquals(InvalidDateOfBirth, expectedText);
        return this;
    }
    public HomePage verifyaccountdetailspage (String expectedText){
        String AccountDetails = readText(accountdetailstextBy);
        assertStringEquals(AccountDetails, expectedText);
        return this;
    }
    public HomePage verifycontactpreferencespage (String expectedText){
        String ContactPreferences = readText(contactpreferencestextBy);
        assertStringEquals(ContactPreferences, expectedText);
        return this;
    }

    public HomePage verifywishlistpage (String expectedTect){
        String WishList = readText(viewwishlisttextBy);
        assertStringEquals(WishList, expectedTect);
        return this;
    }
    public HomePage verifytrackorderspage (String expectedText){
        String TrackOrders = readText(trackorderstextBy);
        assertStringEquals(TrackOrders, expectedText);
        return this;
    }

    public HomePage verifyforgotpasspage (String expectedText){
        String NewPassword = readText(createnewpasstextBy);
        assertStringEquals(NewPassword, expectedText);
        return this;
    }

    public HomePage verifypassretreival (String expectedText){
        String PassRetreival = readText(passretreivalmessageBy);
        assertStringEquals(PassRetreival, expectedText);
        return this;
    }

    public HomePage verifypassretreivalwithemptyemail(String expectedText){
        String EmptyEmailfield = readText(emailadresserrorBy);
        assertStringEquals(EmptyEmailfield, expectedText);
        return this;
    }
    public HomePage verifypassretreivalwithinvalidemailformat(String expectedText){
        String InvalidEmailFormat = readText(emailadresserrorBy);
        assertStringEquals(InvalidEmailFormat, expectedText);
        return this;
    }

    public HomePage verifycancelbuttonBy(String expectedText){
        String Cancel = readText(loginbuttonBy);
        assertStringEquals(Cancel, expectedText);
        return this;
    }

    public HomePage verifypictureshover(){
        displayed(picture4By);
        return this;

    }

    public HomePage verifypicturetoggle(){
        displayed(picture2By);
        return this;
    }
    public HomePage verifyhoverovercollors(String expectedText){
        String HoverCollors = readText(collortextBy);
        assertStringEquals(HoverCollors, expectedText);
        return this;
    }

    public HomePage verifyclickoncollors(String expectedText){
        String ClickCollors = readText(collortextBy);
        assertStringEquals(ClickCollors, expectedText);
        return this;
    }
    public HomePage verifychosensize (String expectedText){
        String ChooseSize = readText(fourthteenthsizeoptionBy);
        assertStringEquals(ChooseSize, expectedText);
        return this;
    }
    public HomePage verifytogglequantity (String expectedValue){
        String togglequantity = readValue(quantityfieldBy);
        assertStringEquals(togglequantity, expectedValue);
        return this;
    }

    public HomePage verifyenteredquantity (){
        displayed(quantityfieldBy);
        return this;
    }

    public HomePage verifyzoomitem () {
        displayed(zoomeditem);
        return this;
    }

    public HomePage verify360item() {
        displayed(sliderBy);
        return this;
    }

    public HomePage verifyaddtowishlist(){
        displayed(wishlistcountBy);
        return this;
    }
    public HomePage verifysizeguide(String expectedText){
        String Charts = readText(chartstextBy);
        assertStringEquals(Charts, expectedText);
        return this;
    }

    public HomePage verifydescriptiontext(String expectedText) {
        String description = readText(collectiontextBy);
        assertStringEquals(description, expectedText);
        return this;
    }

    public HomePage verifydeliverytext(String expectedText){
        String delivery = readText(standarddeliverytextBy);
        assertStringEquals(delivery, expectedText);
        return this;
    }

    public HomePage verifyreturnstext(String expectedText){
        String returns = readText(returnstextBy);
        assertStringEquals(returns, expectedText);
        return this;
    }

    public HomePage verifybrandlink (String expectedText){
        String brandlink = readText(allnikebuttonBy);
        assertStringEquals(brandlink, expectedText);
        return this;
    }

    public HomePage verifyaddtobag (){
        displayed(baggquantityfiledBy);
        return this;
    }

    public HomePage verifyupaowntoggle (){
        displayed(togglepicturesdown);
        return this;
    }



    }
