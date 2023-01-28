package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WindowHandlePage;
import testbase.WebTestBase;

public class WindowHandleTest extends WebTestBase {

    WindowHandlePage windowHandlePage;
    public WindowHandleTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        windowHandlePage = new WindowHandlePage(driver);
    }
    @Test
    public void verifyMouseHoverFunctionality()  {
        SoftAssert softAssert = new SoftAssert();
        windowHandlePage .moveToElementMethod();
        windowHandlePage.clickBuyProduct();
        windowHandlePage.windowHandleMethod();
        windowHandlePage.scrollDown();
        softAssert.assertEquals(windowHandlePage.getTextOfWindowHandlePage(),"Make The Most Of Navratri Colours With These Budget-Friendly Makeup Essentials (Under Rs.1000)","Make The Most Of Navratri Colours With These Budget-Friendly Makeup Essentials (Under Rs.1000) text should be match");
        softAssert.assertAll();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }


}
