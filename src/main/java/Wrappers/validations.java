package Wrappers;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class validations extends commonOps{
    public static void elementText(WebElement element, String expectedValue){
        assertEquals(element.getText(), expectedValue);
    }

    public static void countNumberOfElements(List<WebElement> elements, int expectedListSize){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        assertEquals(elements.size(), expectedListSize);
    }
}
