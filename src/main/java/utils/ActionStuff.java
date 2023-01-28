package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

public class ActionStuff extends WebTestBase {

    public static void hoverOnProduct(WebDriver driver, WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .click(element)
                .build()
                .perform();
    }

}
