package Wrappers;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.SAXException;

import javax.swing.text.Utilities;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class uiActions extends commonOps{

    public uiActions() throws IOException, SAXException, ParserConfigurationException {
    }

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
