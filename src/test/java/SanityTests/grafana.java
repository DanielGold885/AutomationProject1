package SanityTests;

import Utilities.commonOps;
import WorkFlows.webWorkFlows;
import Wrappers.validations;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


@Listeners(Utilities.listeners.class)
public class grafana extends commonOps {
    @BeforeMethod
    public void login() throws IOException, SAXException, ParserConfigurationException {
        webWorkFlows.login(getData("loginUserName"), getData("loginPassword"));
        validations.elementText(grafanaHomePage.pageHeadline, "Home Dashboard");
    }

    @AfterMethod
    public void logout(){
        webWorkFlows.signOut();
        validations.elementText(grafanaLoginPage.loginButton, "Log In");
    }

    @Test(description = "Validate default admin user")
    @Description("Test description: Validate default admin user is present on the server admin screen")
    public void test_01_validateDefaultUser() {
        webWorkFlows.goToServerAdminUsersPage();
        validations.elementText(serverAdminPage.serverAdminPageHeader, "Server Admin");
        validations.elementText(serverAdminPage.adminUserListing, "admin");
    }

    @Test(description = "Validate single user listing")
    @Description("Test description: Validate that only one user listing is present on the server admin screen")
    public void test_02_validateSingleUserOnPage() {
        webWorkFlows.goToServerAdminUsersPage();
        validations.countNumberOfElements(serverAdminPage.userListings, 1);
    }

    @Test(description = "Add a new user")
    @Description("Test Description: Adding a new user from the server admin screen")
    public void test_03_createNewUserFromServerAdminPage() throws InterruptedException, IOException, SAXException,
            ParserConfigurationException {
        webWorkFlows.goToServerAdminUsersPage();
        webWorkFlows.createNewUser(getData("newUserName"), getData("userEmail"),
                getData("userName"), getData("userPassword"));
        validations.countNumberOfElements(serverAdminPage.userListings, 2);
    }
}
