package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base {

    public static void initPageObjectElements() {

        grafanaLoginPage = PageFactory.initElements(driver, PageObjects.Grafana.grafanaLogin.class);
        grafanaHomePage = PageFactory.initElements(driver, PageObjects.Grafana.grafanaHome.class);
        grafanaLeftMenu = PageFactory.initElements(driver, PageObjects.Grafana.grafanaLeftMenu.class);
        serverAdminMenu = PageFactory.initElements(driver, PageObjects.Grafana.serverAdminDropDownMenu.class);
        serverAdminPage = PageFactory.initElements(driver, PageObjects.Grafana.serverAdminPage.class);
        addNewUserTab = PageFactory.initElements(driver, PageObjects.Grafana.addNewUserTab.class);
    }
}
