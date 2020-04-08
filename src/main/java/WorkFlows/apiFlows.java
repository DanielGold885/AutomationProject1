package WorkFlows;

import Utilities.commonOps;
import Wrappers.apiActions;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class apiFlows extends commonOps {
    public apiFlows() throws IOException, SAXException, ParserConfigurationException {
    }

    @Step("Get team from grafana")
    public static String getTeamProperty(String jPath){
        Response response = apiActions.get("/api/teams/search");
        return apiActions.extractFromJson(response, jPath);
    }

    @Step("Create team in grafana")
    public static void postTeam(String name, String email){
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.post(requestParams, "/api/teams");
    }
}
