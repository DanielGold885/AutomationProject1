package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class grafanaLogin {

    @FindBy(how = How.NAME, using = "user")
    public WebElement grafanaUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement grafanaPassword;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(how = How.CSS, using = "a[class='btn btn-link']")
    public WebElement skipButton;
}
