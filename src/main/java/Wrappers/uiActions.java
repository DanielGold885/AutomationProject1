package Wrappers;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.Utilities;

public class uiActions extends commonOps{

    public static void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void setText(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    public static void selectFromDropDown(WebElement element, String value){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select myValue = new Select(element);
        myValue.selectByVisibleText(value);
    }

    public static void hoverOnElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }
}
