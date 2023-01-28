package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class ScrollDownUpPage extends WebTestBase {

    public ScrollDownUpPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
     public void upDownMethod(){
         Utility.scrollDDown();
     }

}
