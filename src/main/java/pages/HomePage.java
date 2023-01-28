
package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {


    @FindBy(xpath = "//a[text()='brands']")
    WebElement  clickOnBrand;


    @FindBy(xpath = "//input[@id='brandSearchBox']")
    WebElement  searchBrand;


    @FindBy(xpath="//input[@name='search-suggestions-nykaa']")
    WebElement searchBox;





    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void    clickOnBrandOption(){
        clickOnBrand.click();
    }

    public void searchBrand(String brandName) {
        searchBox.sendKeys(brandName);
        searchBox.sendKeys(Keys.ENTER);
    }
    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
    }

}




