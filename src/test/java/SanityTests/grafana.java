package SanityTests;

import Utilities.commonOps;
import WorkFlows.webWorkFlows;
import Wrappers.validations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grafana extends commonOps {
    @BeforeMethod
    public void login(){
        webWorkFlows.login("admin", "admin");
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
    public void test_03createNewUserFromServerAdminPage() throws InterruptedException {
        webWorkFlows.goToServerAdminUsersPage();
        webWorkFlows.createNewUser("Moshe", "me@test.io",
                "myNewUserName", "passsowrd12345!");
        Thread.sleep(4000);
        validations.countNumberOfElements(serverAdminPage.userListings, 2);
    }
}
