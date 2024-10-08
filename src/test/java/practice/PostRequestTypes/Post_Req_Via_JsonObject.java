package practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_Req_Via_JsonObject {
	@Test
	public void postDataToServer() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Nagender");
	jobj.put("status", "created");
	jobj.put("teamSize",10);
	jobj.put("projectName", "Ruuba");
	given().contentType(ContentType.JSON)
	.body(jobj.toJSONString())
	.post("http://106.51.90.215:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
  }
}
