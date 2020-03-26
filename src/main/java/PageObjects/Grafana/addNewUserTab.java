package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addNewUserTab {

    @FindBy(how = How.CSS, using = "input[ng-model='user.name']")
    public WebElement nameInput;

    @FindBy(how = How.CSS, using = "input[ng-model='user.email']")
    public WebElement emailInput;

    @FindBy(how = How.CSS, using = "input[ng-model='user.login']")
    public WebElement userNameInput;

    @FindBy(how = How.CSS, using = "input[ng-model='user.password']")
    public WebElement passwordInput;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement createButton;
}
