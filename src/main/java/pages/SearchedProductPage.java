package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class SearchedProductPage extends WebTestBase {

    @FindBy(xpath = "//img[@class='css-11gn9r6']")
    WebElement mouseHoverOnProduct;
    @FindBy(xpath = "//span[@class='AccountText']")
    WebElement textFound;



    public SearchedProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void mouseHover(){
        ActionStuff.hoverOnProduct(driver,mouseHoverOnProduct);
    }
   /* public String getTextFoundOnSearchedProductPage() {
        return textFound.getText();
    }*/
}
