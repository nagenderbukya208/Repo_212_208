package requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Scenario_3_GetPayroolInfo {
@Test
public void sampleTest() {
	//API-1 get authentication 
Response resp=given()
	.formParam("client_id", "ninza-client")
	.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
	.formParam("grant_type", "client_credentials")
	.when()
	.post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
	resp.then()
	.log().all();
	//capture the response
   String token=resp.jsonPath().get("access_token");
	// API-2 get payrol info
	given()
	.auth().oauth2(token)
	.get("http://49.249.28.218:8091/admin/payrools")
	.then()
	.log().all();
}
}
