package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class DropDownPage extends WebTestBase {
    @FindBy(xpath="//input[@name='search-suggestions-nykaa']")
    WebElement searchElementBox;
    @FindBy(xpath="//img[@class='listing-img']")
    WebElement searched;

    @FindBy(xpath="//select[@title='SHADE']")
    WebElement clickArrow;
      @FindBy(xpath="//input[@class='css-i2hz85']")
    WebElement enterCode;

    @FindBy(xpath="//div[@class='css-1mm6m8n']")
    WebElement descriptionText;


    public DropDownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void searchElement(String searchName) {
        searchElementBox.sendKeys(searchName);
        searchElementBox.sendKeys(Keys.ENTER);
    }

    public  void  clickOnTheProduct() {
        searched.click();
    }
    public void handleWindow(){
        Utility.switchToHandleOnWindowHandlePage(driver);
        clickArrow.click();
     }

    public  void arrowClick(){
        clickArrow.click();
    }
    public  void  dropDownPerformed(String value1,String value2){

        Utility.selectValue(clickArrow,value1,value2);
    }

    public void  enterAPinCode(String pinCode) {
        enterCode.sendKeys(pinCode);
        enterCode.sendKeys(Keys.ENTER);
    }
    public String getTextOfDropDownPage() {
        return descriptionText.getText();
    }
    public void scrollDown(){
        Utility.scroll();
    }

}

