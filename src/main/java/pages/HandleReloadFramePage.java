package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HandleReloadFramePage extends WebTestBase {
    @FindBy(xpath="//input[@name='query']")
    WebElement searchOnFrame;

    @FindBy(xpath="//span[@class='hmsprite logo']")
    WebElement searchCompanyNamePageText;

    public HandleReloadFramePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void scrollUPDown(){
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,500)");
    }
    public void frameHandle(String companyName){
        driver.switchTo().frame("moneyiframe");

            searchOnFrame.sendKeys(companyName);
            searchOnFrame.sendKeys(Keys.ENTER);
        Utility.switchToHandleOnWindowHandlePage(driver);
        }

    public String getTextOfHandleReloadFramePage() {
        return searchCompanyNamePageText.getText();
    }
    }

