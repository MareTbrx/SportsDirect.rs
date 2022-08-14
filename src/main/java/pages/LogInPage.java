package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;




public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver){
        super(driver);
    }
    By signinBy = By.className("login");
    By signupbuttonBy = By.xpath("//a[@class='dnnPrimaryAction']");
    By emailBy = By.id("Login_EmailAddress");
    By passwordBy = By.id("Login_Password");
    By loginbuttonBy = By.id("LoginButton");
    By zoomPageBy = By.tagName("html");
    By womensMenuBy = By.id("lnkTopLevelMenu_2624751");
    By nikeOptionBy = By.xpath("//ul[@id='ulTopLevelMenu']/li[3]//ul[@class='Womens']/li[3]/ul/li[3]/ul/li/ul//a[@href='/ladies/footwear/trainers/nike']");
    By forgotyourpasslinkBy = By.cssSelector(".ForgotPasswordLinkButton");
    By retreivalpassemailboxBy = By.id("EmailAddress");
    By sendemailbuttonBy = By.id("EmailRequestSubmit");
    By cancelbuttonBy = By.xpath("/html//form[@id='PasswordResetForm']//a[@href='/login']");
    By acceptcookiesbuttonBy = By.id("onetrust-accept-btn-handler");





    String baseURL = PropertyManager.getInstance().getURL();
    public LogInPage basePage () {
        driver.get(baseURL);
        return this;
    }
    public LogInPage login (String email, String password){
        click(acceptcookiesbuttonBy);
        click(signinBy);
        WriteText(emailBy, email);
        WriteText(passwordBy,password);
        enter(loginbuttonBy);
        //click(loginbuttonBy);
        return this;

    }
    public LogInPage navtoregform() {

        click(acceptcookiesbuttonBy);
        click(signinBy);
        click(signupbuttonBy);
        return this;
    }

    public LogInPage navtologinform(){
        click(acceptcookiesbuttonBy);
        click(signinBy);
        return this;
    }

    public LogInPage forgotyourpasslink(){
        click(forgotyourpasslinkBy);
        return this;
    }

    public LogInPage passretreivalwithvalidemail(String retrivalemail){
        click(forgotyourpasslinkBy);
        WriteText(retreivalpassemailboxBy, retrivalemail);
        click(sendemailbuttonBy);
        return this;
    }

    public  LogInPage passretreivalwithemptyemail (){
        click(forgotyourpasslinkBy);
        click(sendemailbuttonBy);
        return this;
    }

    public LogInPage passretreivalwithinvalidemailformat(String invalidformat){
        click(forgotyourpasslinkBy);
        WriteText(retreivalpassemailboxBy, invalidformat);
        click(sendemailbuttonBy);
        return this;
    }

    public LogInPage passretreivalcancelbutton (){
        click(forgotyourpasslinkBy);
        click(cancelbuttonBy);
        return this;
    }



}
