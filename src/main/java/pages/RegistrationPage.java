package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) { super(driver); }

    By firstnamefieldBy = By.id("Registration_FirstName");
    By lastnamefielddBy = By.id("Registration_LastName");
    By confirmpasswordfieldBy = By.id("Registration_ConfirmPassword");
    By regemailfieldBy = By.id("Registration_EmailAddress");
    By regpasswordfieldBy = By.id("txtPassword");
    By newsletterboxBy = By.id("Registration_IsSubscriber");
    By confirmregbuttonBy = By.id("RegistrationSubmit");
    By titledropdownmenuBy = By.id("Registration_Title");
    By regDaydropdownmenuBy = By.id("Registration_DateOfBirthDay");
    By regMonthdropdownmenuBy = By.id("Registration_DateOfBirthMonth");
    By regYeardropdownmenuBy = By.id("Registration_DateOfBirthYear");


    public RegistrationPage regformfill (String [] array){

        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy,array [2]);
        WriteText(lastnamefielddBy, array [1]);
        WriteText(regemailfieldBy, array[0]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        WriteText(confirmpasswordfieldBy, array [3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformwithoutfirstname(String []array){
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(lastnamefielddBy, array [1]);
        WriteText(regemailfieldBy, array[0]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        WriteText(confirmpasswordfieldBy, array [3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformwithoutlastname (String [] array){
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy, array[2]);
        WriteText(regemailfieldBy, array[0]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        WriteText(confirmpasswordfieldBy, array [3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformwithoutemail (String [] array){
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy,array [2]);
        WriteText(lastnamefielddBy, array [1]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        WriteText(confirmpasswordfieldBy, array [3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformwithoutpass (String[] array){
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy,array [2]);
        WriteText(lastnamefielddBy, array [1]);
        WriteText(regemailfieldBy, array[0]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(confirmpasswordfieldBy, array [3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformwithoutconfirmedpass (String[] array){
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy,array [2]);
        WriteText(lastnamefielddBy, array [1]);
        WriteText(regemailfieldBy, array[0]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

    public RegistrationPage regformfillwithinvalidemailformat (String [] array) {
        Select title = new Select(driver.findElement(titledropdownmenuBy));
        title.selectByValue("Mr");
        WriteText(firstnamefieldBy, array[2]);
        WriteText(lastnamefielddBy, array[1]);
        WriteText(regemailfieldBy, array[4]);
        Select day = new Select(driver.findElement(regDaydropdownmenuBy));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
        month.selectByValue("10");
        Select year = new Select(driver.findElement(regYeardropdownmenuBy));
        year.selectByValue("1994");
        WriteText(regpasswordfieldBy, array[3]);
        click(newsletterboxBy);
        click(confirmregbuttonBy);

        return this;
    }

        public RegistrationPage regformfillwithpassnotmatching (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select day = new Select(driver.findElement(regDaydropdownmenuBy));
            day.selectByValue("15");
            Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
            month.selectByValue("10");
            Select year = new Select(driver.findElement(regYeardropdownmenuBy));
            year.selectByValue("1994");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [4]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;
        }

        public RegistrationPage regformfillwithpassunderminimumchar (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select day = new Select(driver.findElement(regDaydropdownmenuBy));
            day.selectByValue("15");
            Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
            month.selectByValue("10");
            Select year = new Select(driver.findElement(regYeardropdownmenuBy));
            year.selectByValue("1994");
            WriteText(regpasswordfieldBy, array[6]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;
        }

        public RegistrationPage regformfillwithyearwithoutdaymonth (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select year = new Select(driver.findElement(regYeardropdownmenuBy));
            year.selectByValue("1994");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;

        }

        public RegistrationPage regformfillwithyearmonthwithoutday (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
            month.selectByValue("10");
            Select year = new Select(driver.findElement(regYeardropdownmenuBy));
            year.selectByValue("1994");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;
        }
        public RegistrationPage regformfillwithdayyearwithoutmonth (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select day = new Select(driver.findElement(regDaydropdownmenuBy));
            day.selectByValue("15");
            Select year = new Select(driver.findElement(regYeardropdownmenuBy));
            year.selectByValue("1994");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;
        }

        public RegistrationPage regformfillwithdaywithoutmonthyear (String [] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select day = new Select(driver.findElement(regDaydropdownmenuBy));
            day.selectByValue("15");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;

        }

        public RegistrationPage regformfillwithdaymonthwithoutyear (String[] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select day = new Select(driver.findElement(regDaydropdownmenuBy));
            day.selectByValue("15");
            Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
            month.selectByValue("10");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;
        }

        public RegistrationPage regformfillwithmonthwithoutdayyear (String[] array){
            Select title = new Select(driver.findElement(titledropdownmenuBy));
            title.selectByValue("Mr");
            WriteText(firstnamefieldBy,array [2]);
            WriteText(lastnamefielddBy, array [1]);
            WriteText(regemailfieldBy, array[0]);
            Select month = new Select(driver.findElement(regMonthdropdownmenuBy));
            month.selectByValue("10");
            WriteText(regpasswordfieldBy, array[3]);
            WriteText(confirmpasswordfieldBy, array [3]);
            click(newsletterboxBy);
            click(confirmregbuttonBy);

            return this;

        }


}
