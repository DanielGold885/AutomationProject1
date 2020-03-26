package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class grafanaHome {

    @FindBy(how = How.XPATH, using = "//span[text()='Home Dashboard']")
    public WebElement pageHeadline;
}
