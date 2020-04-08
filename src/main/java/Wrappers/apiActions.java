package Wrappers;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class apiActions extends commonOps {
    public apiActions() throws IOException, SAXException, ParserConfigurationException {
    }

    @Step("Get data from server")
    public static Response get(String params){
        response = httpRequest.get(params);
        System.out.println(response.prettyPrint());
        return response;
    }

    @Step("Extract value from JSON")
    public static String extractFromJson(Response response, String Path){
        jp = response.jsonPath();
        System.out.println(response.prettyPrint());
        return jp.get(Path).toString();
    }

    @Step("Post data to server")
    public static void post(JSONObject params, String destination){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(destination);
        System.out.println(response.prettyPrint());
    }

    @Step("Update data in server")
    public static void put(JSONObject params, String destination){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(destination);
        System.out.println(response.prettyPrint());
    }

    @Step("Delete data from server")
    public static void delete(String resource, String id){
        response = httpRequest.delete(resource + id);
        System.out.println(response.prettyPrint());
    }
}
