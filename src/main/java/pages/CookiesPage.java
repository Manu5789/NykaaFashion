package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class CookiesPage extends WebTestBase {

    public CookiesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void  cookiesGet() {
        Utility.getCookiesMethod();
    }
    public void cookieADD(String  Key1, String value){
        Utility.addCookiesMethod( driver,Key1,value);
    }
     public void cookieDeleteByName(String value1){
        Utility.deleteCookiesByNameMethod(driver,value1);
    }
    public void cookieAllDelete() {
          Utility.deleteAllCookiesMethod(driver);
    }
}
