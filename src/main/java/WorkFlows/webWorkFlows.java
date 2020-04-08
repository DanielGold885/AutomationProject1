package WorkFlows;

import Utilities.commonOps;
import Wrappers.uiActions;
import io.qameta.allure.Step;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class webWorkFlows extends commonOps {
    public webWorkFlows() throws IOException, SAXException, ParserConfigurationException {
    }

    @Step("Grafana Login flow")
    public static void login(String userName, String password){
        uiActions.setText(grafanaLoginPage.grafanaUserName, userName);
        uiActions.setText(grafanaLoginPage.grafanaPassword, password);
        uiActions.click(grafanaLoginPage.loginButton);
        uiActions.click(grafanaLoginPage.skipButton);
    }

    @Step("GOTO server admin page")
    public static void goToServerAdminUsersPage(){
        uiActions.hoverOnElement(grafanaLeftMenu.serverAdminButton);
        uiActions.click(serverAdminMenu.usersButton);
    }

    @Step("Logout")
    public static void signOut(){
        uiActions.hoverOnElement(grafanaLeftMenu.signOutAvatar);
        uiActions.click(grafanaLeftMenu.signOutButton);
    }

    @Step("Create new user from server admin page")
    public static void createNewUser(String newUserName, String newUserEmail,
                                     String newUserPassword, String newUserUsername){
        uiActions.click(serverAdminPage.newUserBtn);
        uiActions.setText(addNewUserTab.nameInput, newUserName);
        uiActions.setText(addNewUserTab.emailInput, newUserEmail);
        uiActions.setText(addNewUserTab.userNameInput, newUserUsername);
        uiActions.setText(addNewUserTab.passwordInput, newUserPassword);
        uiActions.click(addNewUserTab.createButton);
    }
}
