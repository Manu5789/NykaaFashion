package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class SelectBoxAndButtonPage extends WebTestBase {
    @FindBy(xpath = "//li[@id='popups']")
    WebElement hoverOnFashion;
    @FindBy(xpath = "//a[text()='Toys & Games']")
    WebElement clickOnToys;
    @FindBy(xpath = "//span[text()='2075']")
    WebElement clickOnBoyBtn;
    @FindBy(xpath = "//span[text()='1855']")
    WebElement clickOnGirlBtn;
    @FindBy(xpath = "//h1[text()='Toys and Games']")
    WebElement textFound;


    public SelectBoxAndButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void hoverMethod() {
        ActionStuff.hoverOnProduct(driver, hoverOnFashion);
    }
    public void clickOnGameToys() {
        clickOnToys.click();
        Utility.DownScroll();
    }
    public void isSelectMethod() {
        System.out.println("Status Of Boy Radio Button:-" + clickOnBoyBtn.isSelected());
        clickOnGirlBtn.click();
        System.out.println("Status Of Girl Radio Button:-" + clickOnGirlBtn.isSelected());
    }
    public String getTextSelectBoxAndButtonPage() {
        return textFound.getText();
    }

}
