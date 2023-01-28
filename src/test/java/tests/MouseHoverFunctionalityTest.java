package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MouseHoverFunctionalityPage;
import testbase.WebTestBase;


public class MouseHoverFunctionalityTest extends WebTestBase {

    MouseHoverFunctionalityPage mouseHoverFunctionalityPage;

    public MouseHoverFunctionalityTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        mouseHoverFunctionalityPage=new MouseHoverFunctionalityPage(driver);
    }
    @Test
    public void verifyMouseHoverAction(){
        SoftAssert softAssert = new SoftAssert();
        mouseHoverFunctionalityPage.mouseHoverMethod();
       softAssert.assertEquals(mouseHoverFunctionalityPage.getTextMouseHoverFunctionalityPage(),"Women","Women text should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
