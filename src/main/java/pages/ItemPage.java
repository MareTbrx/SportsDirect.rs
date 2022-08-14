package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{

    public ItemPage (WebDriver driver) { super(driver); }

    By sneakersitemBy = By.cssSelector("[href='\\/nike-air-max-invigor-trainers-mens-121261\\#colcode\\=12126140'] .SlideInfoContain");
    By picture1By = By.id("piThumb1_piThumbImg");
    By picture2By = By.id("piThumb2_piThumbImg");
    By picture3By = By.id("piThumb3_piThumbImg");
    By picture4By = By.id("piThumb4_piThumbImg");
    By picture5By = By.id("piThumb5_piThumbImg");
    By nextarrowbuttonBy = By.cssSelector("[rel='next']");
    By previousarrowbuttonBy = By.cssSelector("[rel='prev']");
    By secondcolloroptionBy = By.id("cvli12126103");
    By thirdcolloroptionBy = By.id("cvli12126172");
    By fourthcolloroptionBy = By.id("cvli12126118");
    By fifthcolloroptionBy = By.id("cvli12126147");
    By sixtcolloroptionBy = By.id("cvli12126174");
    By seventhcolloroptionBy = By.id("cvli12126126");
    By eightcolloroptionBy = By.id("cvli12126175");
    By ninehtcolloroptionBy = By.id("cvli12126173");
    By tenthcolloroptionBy = By.id("cvli12126169");
    By eleventhcolloroptionby = By.id("cvli12126125");
    By firstsizeoptionBy = By.xpath("/html//a[@id='ancLink']");
    By secondsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[2]/a[@id='ancLink']");
    By thirdsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[3]/a[@id='ancLink']");
    By fourthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[4]/a[@id='ancLink']");
    By fifthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[5]/a[@id='ancLink']");
    By sixthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[6]/a[@id='ancLink']");
    By seventhsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[7]/a[@id='ancLink']");
    By eightsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[8]/a[@id='ancLink']");
    By ninethsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[9]/a[@id='ancLink']");
    By tenthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[10]/a[@id='ancLink']");
    By eleventhsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[11]/a[@id='ancLink']");
    By twelwesizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[12]/a[@id='ancLink']");
    By threeteenthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[13]/a[@id='ancLink']");
    By fourthteenthsizeoptionBy = By.xpath("//ul[@id='ulSizes']/li[14]/a[@id='ancLink']");
    By increasequantitybuttonBy = By.xpath("/html//div[@id='divMultiplePurchases']//a[@title='Increase quantity']");
    By decreasequantitybuttonBy = By.xpath("//div[@id='divMultiplePurchases']//a[@title='Reduce quantity']/span[@class='prodremove']");
    By quantityboxBy = By.id("ProductQty");
    By zoombuttonBy = By.id("mainImageButtonZoom");
    By button360By = By.id("Popup360ButtonWrapper");
    By slider360By = By.id("slider");
    By addtowishlistbuttonBy = By.cssSelector(".pdpWishListIco");
    By sizeguiedbuttonBy = By.id("spnSizeGuideText");
    By acceptcookiesbuttonBy = By.id("onetrust-accept-btn-handler");
    By descriptionbuttonBy = By.id("liProductInfoTab");
    By returnsbuttonBy = By.id("liReturnsTab");
    By deliverybuttonBy = By.id("liDeliveryTab");
    By brandlinkbuttonBy = By.id("lblProductBrand");
    By addtobgabuttonBy = By.id("aAddToBag");
    By togglepicturesdown = By.cssSelector("span#sNextImg > .glyphicon.glyphicon-circle-arrow-right");
    By togglepicturesup = By.cssSelector("span#sPrevImg > .glyphicon.glyphicon-circle-arrow-left");








    public ItemPage navtoitem(){
        click(acceptcookiesbuttonBy);
        click(sneakersitemBy);
        return this;
    }

    public ItemPage navtoitemforwishlist(){
        click(sneakersitemBy);
        return this;
    }

    public ItemPage hoverpictures(){
        hover(picture1By); hover(picture2By); hover(picture3By); hover(picture4By); hover(picture5By);
        scrool();
        return this;

    }

    public ItemPage togglepicturesleftright(){
        click(nextarrowbuttonBy);
        click(nextarrowbuttonBy);
        click(nextarrowbuttonBy);
        click(previousarrowbuttonBy);
        click(previousarrowbuttonBy);
        return this;
    }

    public ItemPage hoverovercollors(){
        hover(secondcolloroptionBy);
        hover(fourthcolloroptionBy);
        hover(sixtcolloroptionBy);
        hover(eightcolloroptionBy);
        hover(tenthcolloroptionBy);
        return this;

    }
    public ItemPage clickoncollors() {
        click(thirdcolloroptionBy);
        click(fifthcolloroptionBy);
        click(seventhcolloroptionBy);
        click(ninehtcolloroptionBy);
        click(eleventhcolloroptionby);
        return this;
    }

    public ItemPage chosesize(){
        click(firstsizeoptionBy); click(secondsizeoptionBy); click(thirdsizeoptionBy);
        click(fourthsizeoptionBy); click(fifthsizeoptionBy); click(sixthsizeoptionBy); click(seventhsizeoptionBy);
        click(eightsizeoptionBy); click(ninethsizeoptionBy); click(tenthsizeoptionBy); click(eleventhsizeoptionBy);
        click(twelwesizeoptionBy); click(threeteenthsizeoptionBy); click(fourthteenthsizeoptionBy);
        return this;
    }

    public ItemPage togglequantity(){
        click(increasequantitybuttonBy);
        click(increasequantitybuttonBy);
        click(decreasequantitybuttonBy);
        return this;

    }

    public ItemPage enterquantity(String[] array ){
        click(quantityboxBy);
        WriteText(quantityboxBy, array[7]);
        return this;

    }

    public ItemPage zoomitem (){
        click(zoombuttonBy);
        return this;
    }

    public ItemPage viewitem360(){
        click(button360By);
        drag(slider360By);
        return this;
    }

    public ItemPage addtowishlist(){
        click(firstsizeoptionBy);
        scrool();
        click(addtowishlistbuttonBy);
        return this;
    }

    public ItemPage sizeguied(){
        click(sizeguiedbuttonBy);
        return this;
    }

    public ItemPage description(){
        scrool();
        click(deliverybuttonBy);
        click(descriptionbuttonBy);
        return this;
    }
    public ItemPage delivery(){
        scrool();
        click(deliverybuttonBy);
        return this;
    }

    public ItemPage returns(){
        scrool();
        click(returnsbuttonBy);
        return this;
    }

    public ItemPage brandlink(){
        click(brandlinkbuttonBy);
        return this;
    }

    public ItemPage addtobag(){
        click(firstsizeoptionBy);
        scrool();
        click(addtobgabuttonBy);
        return this;
    }

    public ItemPage toggleupdown(){
        click(togglepicturesdown);
        click(togglepicturesup);
        return this;

    }

}
