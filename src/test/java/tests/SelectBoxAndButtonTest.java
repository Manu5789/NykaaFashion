package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SelectBoxAndButtonPage;
import testbase.WebTestBase;

public class SelectBoxAndButtonTest extends WebTestBase {
    SelectBoxAndButtonPage selectBoxAndButtonPage;
    public SelectBoxAndButtonTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        selectBoxAndButtonPage= new SelectBoxAndButtonPage(driver);
    }
    @Test
    public void isSelectMethodPerformed() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        selectBoxAndButtonPage.hoverMethod();
        selectBoxAndButtonPage.clickOnGameToys();
        selectBoxAndButtonPage.isSelectMethod();
        softAssert.assertEquals(selectBoxAndButtonPage.getTextSelectBoxAndButtonPage() ,"Toys and Games","Toys and Games text should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
