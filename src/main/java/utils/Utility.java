package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;

import java.util.Set;

public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 40;
    public static final long IMPLICITLY_WAIT = 20;




    public static void switchToHandleOnWindowHandlePage(WebDriver driver) {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindow.contentEquals(s)) ;
            {
                driver.switchTo().window(s);
            }
        }
    }

        public static void DownScroll(){
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,300)");
    }




    public static void selectValue(WebElement element, String value1, String value2) {
        Select dropDown = new Select(element);
        if (value1.equalsIgnoreCase("byvalue")) {
            dropDown.selectByValue(value2);
        } else if (value1.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value2));
        } else if (value1.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value2);
        } else {
            System.out.println("please select the correct value");
        }
    }
    public static void scroll(){
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,500)");
    }

    //Cookie

    public static void getCookiesMethod() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cok : cookies) {
            System.out.println(cok);
        }
        System.out.println("GetCookies Method_________________________________________________________________");
    }

    public static void addCookiesMethod(WebDriver driver, String key1, String value) {
        Cookie addCookie = new Cookie(key1, value);
        driver.manage().addCookie(addCookie);
        System.out.println("Add Cookie Method____________________________________________________");
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cok : cookies) {
            System.out.println(cok);
            System.out.println("Add Cookie Method____________________________________________________");
        }
    }
       public static void deleteCookiesByNameMethod(WebDriver driver,String value1){
         driver.manage().deleteCookieNamed(value1);
       System.out.println("Delete cookieMethod By Name____________________________________________________");
    }

   public static void deleteAllCookiesMethod(WebDriver driver) {
        driver.manage().deleteAllCookies();
        System.out.println("DeleteAllCookies___________________________________________________________");
    }


    public static void scrollDDown( ) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,1000)");
        je.executeScript("window.scrollBy(0,-500)");
    }
}

