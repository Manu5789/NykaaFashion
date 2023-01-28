package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropDownPage;
import testbase.WebTestBase;

public class DropDownTest extends WebTestBase {
    DropDownPage dropDownPage;
    public DropDownTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        dropDownPage= new DropDownPage(driver);
    }
    @Test
    public void dropDownPerform() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        dropDownPage.searchElement(prop.getProperty("searchName"));
        dropDownPage.clickOnTheProduct();
        dropDownPage.handleWindow();
        dropDownPage.arrowClick();
        dropDownPage.dropDownPerformed("byIndex","3");
        dropDownPage.enterAPinCode(prop.getProperty("pinCode"));
        Thread.sleep(4000);
        softAssert.assertEquals(dropDownPage.getTextOfDropDownPage(),"Product Description","Product Description text should be match");
        softAssert.assertAll();
        dropDownPage.scrollDown();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
