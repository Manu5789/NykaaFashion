package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CookiesPage;

import testbase.WebTestBase;

public class CookiesTest extends WebTestBase{
    CookiesPage cookiesPage;
    public CookiesTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        cookiesPage = new CookiesPage(driver);
    }
    @Test
    public void verifyCookies()
    {
        cookiesPage.cookiesGet();
        cookiesPage.cookieADD("Youtube","Manjusha");
        cookiesPage.cookieDeleteByName("1366_768");
        cookiesPage.cookieAllDelete();
    }


}
