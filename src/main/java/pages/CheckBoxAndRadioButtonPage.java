package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class CheckBoxAndRadioButtonPage extends WebTestBase {
    @FindBy(xpath="//input[@id='gender-male']")
    WebElement mRadioBtn;
    @FindBy(xpath="//input[@id='gender-female']")
    WebElement fRadioBtn;
    @FindBy(xpath="//div[@class='page-title']")
    WebElement pageTitle;

    public CheckBoxAndRadioButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void isSelectMethod(){
        System.out.println("Status Of Male Radio Button:-"+  mRadioBtn.isSelected());
        fRadioBtn.click();
        System.out.println("Status Of Female Radio Button:-"+  fRadioBtn.isSelected());
    }
    public String getTextOfCheckBoxAndRadioButtonPage() {
        return pageTitle.getText();
    }
}