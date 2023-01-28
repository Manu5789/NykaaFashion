package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckBoxAndRadioButtonPage;
import pages.VisibilityOfElementPage;
import testbase.WebTestBase;

public class CheckBoxAnRadioButtonTest extends WebTestBase {
    VisibilityOfElementPage visibilityOfElementPage;
    CheckBoxAndRadioButtonPage checkBoxAndRadioButtonPage;
    public CheckBoxAnRadioButtonTest()
    {
        super();

    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        checkBoxAndRadioButtonPage= new CheckBoxAndRadioButtonPage(driver);
        visibilityOfElementPage=new VisibilityOfElementPage(driver);
    }
    @Test

   public  void verifyIsSelectMethodForRadioButton()
    {

        SoftAssert softAssert = new SoftAssert();
        checkBoxAndRadioButtonPage.isSelectMethod();
        softAssert.assertEquals(checkBoxAndRadioButtonPage.getTextOfCheckBoxAndRadioButtonPage() ,"Register","Register text should be match");
        softAssert.assertAll();

    }

    @Test
    public void verifyVisibilityMethod()
    {
        visibilityOfElementPage.isDisplayedMethod();
        visibilityOfElementPage.isEnableMethod();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
