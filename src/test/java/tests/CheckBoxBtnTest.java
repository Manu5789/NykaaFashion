package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckBoxBtnPage;
import testbase.WebTestBase;

public class CheckBoxBtnTest extends WebTestBase {
    CheckBoxBtnPage checkBoxBtnPage;
    public CheckBoxBtnTest()
    {
        super();

    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        checkBoxBtnPage=new CheckBoxBtnPage(driver);
    }
    @Test

        public  void verifyIsSelectMethodForCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        checkBoxBtnPage.hoverMouseMethod();
        checkBoxBtnPage.clickOnDecorOption();
        checkBoxBtnPage.checkBoxMethod();
        softAssert.assertEquals(checkBoxBtnPage.getTextCheckBoxBtnPage() ,"Decor","Decor text should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
    }

