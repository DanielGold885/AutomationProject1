package SanityTests;

import Utilities.commonOps;
import WorkFlows.apiFlows;
import Wrappers.validations;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class grafanaApi extends commonOps {
    public grafanaApi() throws IOException, SAXException, ParserConfigurationException {
    }

    @Test(description = "Get Team from grafana")
    @Description("Login to grafana and get team")
    public void Test_01_getTeamList() throws IOException, SAXException, ParserConfigurationException {
        validations.textValidation(apiFlows.getTeamProperty("teams[0].name"),
                getData("existingTeamName"));
    }

    @Test(description = "Create a Team in grafana")
    @Description("Add a team and verify")
    public void Test_02_createNewTeam() throws IOException, SAXException, ParserConfigurationException {
        apiFlows.postTeam(getData("newTeamName"), getData("newTeamEmail"));
    }
}
