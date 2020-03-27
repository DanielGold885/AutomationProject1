package SanityTests;

import Utilities.commonOps;
import WorkFlows.webWorkFlows;
import Wrappers.validations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class grafana extends commonOps {
    @BeforeMethod
    public void login() throws IOException, SAXException, ParserConfigurationException {
        webWorkFlows.login(getData("loginUserName"), getData("loginPassword"));
        validations.elementText(grafanaHomePage.pageHeadline, "Home Dashboard");
    }

    @AfterMethod
    public void logOut(){
        webWorkFlows.signOut();
        validations.elementText(grafanaLoginPage.loginButton, "Log In");
    }

    @Test
    public void test_01validateDefaultUser() {
        webWorkFlows.goToServerAdminUsersPage();
        validations.elementText(serverAdminPage.serverAdminPageHeader, "Server Admin");
        validations.elementText(serverAdminPage.adminUserListing, "admin");
    }

    @Test
    public void test_02validateSingleUserOnPage() {
        webWorkFlows.goToServerAdminUsersPage();
        validations.countNumberOfElements(serverAdminPage.userListings, 1);
    }

    @Test
    public void test_03createNewUserFromServerAdminPage() throws InterruptedException, IOException, SAXException,
            ParserConfigurationException {
        webWorkFlows.goToServerAdminUsersPage();
        webWorkFlows.createNewUser(getData("newUserName"), getData("userEmail"),
                getData("userName"), getData("userPassword"));
        validations.countNumberOfElements(serverAdminPage.userListings, 2);
    }
}
