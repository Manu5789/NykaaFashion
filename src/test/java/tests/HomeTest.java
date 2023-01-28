/*package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;
public class HomeTest extends WebTestBase {

    HomePage homePage;
    public HomeTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        homePage=new HomePage(driver);

    }
    @Test
    public void  searchForProduct(){
       // SoftAssert softAssert = new SoftAssert();

        homePage.searchProduct(prop.getProperty("productName"));
       /* softAssert.assertEquals(signInPage.getTextOfSignInPage(),"login / register","login / register text should be match");
        softAssert.assertAll();

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}*/

