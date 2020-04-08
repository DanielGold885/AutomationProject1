import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class temp {

    String URL = "http://localhost:3333";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void testing(){
        JSONObject params = new JSONObject();
        params.put("name", "Ateam");
        params.put("email", "blsasdfsdf@test.com");

        RestAssured.baseURI = URL;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
        httpRequest.header("Content-Type", "application/json");

        httpRequest.body(params.toJSONString());

        response = httpRequest.post("/api/teams");

    //    response = httpRequest.get("/api/teams/search?perpage=50&page=1");
        System.out.println(response.prettyPrint());

    }
}
