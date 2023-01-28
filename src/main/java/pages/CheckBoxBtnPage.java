package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class CheckBoxBtnPage extends WebTestBase {

    @FindBy(xpath = "//li[@id='popups']")
    WebElement hoverFashion;
    @FindBy(xpath = "//a[text()='Decor']")
    WebElement clickOnDecor;
    @FindBy(xpath = "//span[text()='Amoli Concepts']")
    WebElement clickCheckBox;
    @FindBy(xpath = "//h1[text()='Decor']")
    WebElement foundText;

    public CheckBoxBtnPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void hoverMouseMethod() {
        ActionStuff.hoverOnProduct(driver, hoverFashion);
    }
    public void clickOnDecorOption() {
        clickOnDecor.click();
        Utility.DownScroll();
    }
    public void checkBoxMethod(){
        clickCheckBox.click();
    }
    public String getTextCheckBoxBtnPage () {
        return foundText.getText();
    }
}
