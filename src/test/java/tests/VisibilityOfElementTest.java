package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.VisibilityOfElementPage;
import testbase.WebTestBase;

public class VisibilityOfElementTest extends WebTestBase {
      VisibilityOfElementPage visibilityOfElementPage;
    public VisibilityOfElementTest()
    {
        super();

    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        visibilityOfElementPage= new VisibilityOfElementPage(driver);
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
