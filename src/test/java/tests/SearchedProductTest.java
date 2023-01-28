package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;
public class SearchedProductTest extends WebTestBase {

    HomePage homePage;
    SearchedProductPage searchedProductPage;
    MouseHoverFunctionalityPage mouseHoverFunctionalityPage;
    WindowHandlePage windowHandlePage;
    DropDownPage dropDownPage;
    SelectBoxAndButtonPage selectBoxAndButtonPage;
    CheckBoxBtnPage checkBoxBtnPage;
    CookiesPage cookiesPage;

    public SearchedProductTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage(driver);
        searchedProductPage = new SearchedProductPage(driver);
        mouseHoverFunctionalityPage= new MouseHoverFunctionalityPage(driver);
        windowHandlePage=new WindowHandlePage(driver);
        dropDownPage=new DropDownPage(driver);
        selectBoxAndButtonPage=new SelectBoxAndButtonPage(driver);
        checkBoxBtnPage=new CheckBoxBtnPage(driver);
        cookiesPage=new CookiesPage(driver);
    }
    /*@Test
    public void  searchedProduct() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnBrandOption();
        homePage.searchBrand(prop.getProperty("brandName"));
        Thread.sleep(5000);
        homePage.searchProduct(prop.getProperty("productName"));
        Thread.sleep(7000);
        searchedProductPage.mouseHover();
    }
    @Test(priority = 1)
    public void verifyMouseHoverAction(){
        SoftAssert softAssert = new SoftAssert();
        mouseHoverFunctionalityPage.mouseHoverMethod();
        softAssert.assertEquals(mouseHoverFunctionalityPage.getTextMouseHoverFunctionalityPage(),"Women","Women text should be match");
        softAssert.assertAll();
    }

    @Test(priority = 3)
        public void dropDownPerform() {
        SoftAssert softAssert = new SoftAssert();
        dropDownPage.searchElement(prop.getProperty("searchName"));
        dropDownPage.clickOnTheProduct();
        dropDownPage.handleWindow();
        dropDownPage.arrowClick();
        dropDownPage.dropDownPerformed("byIndex","3");
        dropDownPage.enterAPinCode(prop.getProperty("pinCode"));
        softAssert.assertEquals(dropDownPage.getTextOfDropDownPage(),"Product Description","Product Description text should be match");
        softAssert.assertAll();
        dropDownPage.scrollDown();
    }*/
    @Test(priority = 2)
    public void verifyWindowHandleFunctionality()  {

        SoftAssert softAssert = new SoftAssert();
            windowHandlePage .moveToElementMethod();
            windowHandlePage.clickBuyProduct();
            windowHandlePage.windowHandleMethod();
            windowHandlePage.scrollDown();
            softAssert.assertEquals(windowHandlePage.getTextOfWindowHandlePage(),"Make The Most Of Navratri Colours With These Budget-Friendly Makeup Essentials (Under Rs.1000)","Make The Most Of Navratri Colours With These Budget-Friendly Makeup Essentials (Under Rs.1000) text should be match");
            softAssert.assertAll();
        }
  /*  @Test(priority = 5)
    public void isSelectMethodPerformed() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        selectBoxAndButtonPage.hoverMethod();
        selectBoxAndButtonPage.clickOnGameToys();
        selectBoxAndButtonPage.isSelectMethod();
        softAssert.assertEquals(selectBoxAndButtonPage.getTextSelectBoxAndButtonPage() ,"Toys and Games","Toys and Games text should be match");
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public  void verifyIsSelectMethodForCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        checkBoxBtnPage.hoverMouseMethod();
        checkBoxBtnPage.clickOnDecorOption();
        checkBoxBtnPage.checkBoxMethod();
        softAssert.assertEquals(checkBoxBtnPage.getTextCheckBoxBtnPage() ,"Decor","Decor text should be match");
        softAssert.assertAll();
    }
    @Test(priority = 6)
    public void verifyCookies()
    {
        cookiesPage.cookiesGet();
        cookiesPage.cookieADD("Youtube","Manjusha");
        cookiesPage.cookieDeleteByName("1366_768");
        cookiesPage.cookieAllDelete();
    }*/
  @AfterMethod
  public void afterMethod(){
      driver.close();
  }
}


