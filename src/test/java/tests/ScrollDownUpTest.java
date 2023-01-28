package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.ScrollDownUpPage;
import testbase.WebTestBase;

public class ScrollDownUpTest extends WebTestBase {

    ScrollDownUpPage scrollDownUpPage;
    public ScrollDownUpTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        scrollDownUpPage= new ScrollDownUpPage(driver);
    }
    @Test
    public void  verifyScrollDownUpFunctionality(){
        scrollDownUpPage.upDownMethod();
    }
}
