package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class WindowHandlePage extends WebTestBase {


    @FindBy(xpath="//a[text()='beauty advice']")
    WebElement moveToElement;
    @FindBy(xpath="//div[@class='beautyadviceHeading']")
    WebElement clickToProduct;

   @FindBy(xpath="//a[text()=' Makeup ']")
    WebElement clickOnMakeupOption;
    @FindBy(xpath="//div[text()='Make The Most Of Navratri Colours With These Budget-Friendly Makeup Essentials (Under Rs.1000)']")
    WebElement pageTitle;


    public WindowHandlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void  moveToElementMethod(){
        ActionStuff.hoverOnProduct(driver,moveToElement);
    }
    public void clickBuyProduct()
    {
        clickToProduct.click();
    }

    public void windowHandleMethod() {
        clickOnMakeupOption.click();
        Utility. switchToHandleOnWindowHandlePage(driver);
    }

    public void scrollDown(){
        Utility.scroll();
    }

    public String getTextOfWindowHandlePage(){
        return pageTitle.getText();
    }

}
