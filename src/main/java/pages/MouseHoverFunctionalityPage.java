package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class MouseHoverFunctionalityPage extends WebTestBase {

    @FindBy(xpath = "//li[@id='popups']")
    WebElement mouseHoverOnFashion;
    @FindBy(xpath = "//div[text()='Women']")
    WebElement textBrands;


    public MouseHoverFunctionalityPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void mouseHoverMethod()
    {
        ActionStuff.hoverOnProduct(driver,mouseHoverOnFashion);
    }

   public String getTextMouseHoverFunctionalityPage () {
        return textBrands.getText();
    }
}
