package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class serverAdminDropDownMenu {
    @FindBy(how = How.XPATH, using = "//a[@href='/admin/users']")
    public WebElement usersButton;
}
