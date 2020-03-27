package Wrappers;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.Utilities;

public class uiActions extends commonOps{

    @Step("Click")
    public static void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @Step("Set text")
    public static void setText(WebElement element, String value){
       // wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    @Step("Select from dropdown")
    public static void selectFromDropDown(WebElement element, String value){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select myValue = new Select(element);
        myValue.selectByVisibleText(value);
    }

    @Step("Mouse hover")
    public static void hoverOnElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }
}
