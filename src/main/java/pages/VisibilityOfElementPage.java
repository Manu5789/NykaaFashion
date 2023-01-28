package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class VisibilityOfElementPage extends WebTestBase {
    @FindBy(xpath="//input[@id='small-searchterms']")
    WebElement searchBox;

    public VisibilityOfElementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
     public void isDisplayedMethod(){
      System.out.println("Display Status:-"+ searchBox.isDisplayed());
    }
    public void isEnableMethod(){
      System.out.println("Enable Status:-"+ searchBox.isEnabled());
    }


}
