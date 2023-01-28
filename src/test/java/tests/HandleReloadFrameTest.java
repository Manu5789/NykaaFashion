package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HandleReloadFramePage;
import testbase.WebTestBase;

public class HandleReloadFrameTest extends WebTestBase {
    HandleReloadFramePage handleReloadFramePage;

    public HandleReloadFrameTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        handleReloadFramePage = new HandleReloadFramePage(driver);
    }
    @Test
    public void verifyFrame(){
        SoftAssert softAssert = new SoftAssert();
        handleReloadFramePage.scrollUPDown();
        handleReloadFramePage.frameHandle(prop.getProperty("companyName"));
       // handleReloadFramePage.getTextOfHandleReloadFramePage();
        softAssert.assertEquals(handleReloadFramePage.getTextOfHandleReloadFramePage() ,"Hi Guest","Hi Guest text should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
