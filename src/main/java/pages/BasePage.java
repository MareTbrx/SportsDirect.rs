package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        Actions actions = new Actions(driver);

    }




    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void WriteText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertStringEquals(String string, String expectedText) {
        Assert.assertEquals(string, expectedText);

    }

    public void enter(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(Keys.ENTER);
    }

    public String readValue(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("value");
    }

    public void  hover (By elementBy){
        waitVisibility(elementBy);
        WebElement ele = driver.findElement(elementBy);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();

    }
    public boolean displayed (By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).isDisplayed();
        return true;

    }

    public void drag (By elementBy){
        waitVisibility(elementBy);
        WebElement slider = driver.findElement(elementBy);
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 300  , 0).perform();

    }
    public void scrool (){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }


}