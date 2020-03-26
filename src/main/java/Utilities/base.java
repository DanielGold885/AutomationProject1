package Utilities;

import PageObjects.Grafana.serverAdminPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class base {

    protected static WebDriver driver;
    public static Actions actions;
    public static WebDriverWait wait;

    //TODO add implementation for chromeOptions or desired capabilities

    public static PageObjects.Grafana.grafanaLogin grafanaLoginPage;
    public static PageObjects.Grafana.grafanaHome grafanaHomePage;
    public static PageObjects.Grafana.serverAdminDropDownMenu serverAdminMenu;
    public static PageObjects.Grafana.grafanaLeftMenu grafanaLeftMenu;
    public static PageObjects.Grafana.serverAdminPage serverAdminPage;
    public static PageObjects.Grafana.addNewUserTab addNewUserTab;
}
