package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class serverAdminPage {
    @FindBy(how = How.CSS, using = "h1[class='page-header__title']")
    public WebElement serverAdminPageHeader;

    @FindBy(how = How.CSS, using = "tr[ng-repeat='user in ctrl.users']")
    public List<WebElement> userListings;

    @FindBy(how = How.CSS, using = "a[class='btn btn-primary']")
    public WebElement newUserBtn;

    @FindBy(how = How.XPATH, using = "//td[@class='link-td']")
    public WebElement adminUserListing;
}
