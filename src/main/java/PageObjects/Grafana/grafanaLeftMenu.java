package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class grafanaLeftMenu {
    @FindBy(how = How.CSS, using = "i[class='gicon gicon-shield']")
    public WebElement serverAdminButton;

    @FindBy(how = How.CSS, using = "i[class='fa fa-fw fa-plus']']")
    public WebElement createPlusButton;

    @FindBy(how = How.CSS, using = "i[class='gicon gicon-dashboard']")
    public WebElement dashboards;

    @FindBy(how = How.CSS, using = "i[class='gicon gicon-explore']")
    public WebElement explore;

    @FindBy(how = How.CSS, using = "i[class='gicon gicon-alert']")
    public WebElement alerting;

    @FindBy(how = How.CSS, using = "i[class='gicon gicon-cog']")
    public WebElement configuration;

    @FindBy(how = How.XPATH, using = "//img[@src='/avatar/46d229b033af06a191ff2267bca9ae56']")
    public WebElement signOutAvatar;

    @FindBy(how = How.CSS, using = "i[class='fa fa-fw fa-sign-out']")
    public WebElement signOutButton;
}
