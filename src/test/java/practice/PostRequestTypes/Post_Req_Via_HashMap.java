package practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_Req_Via_HashMap {
	@Test
	public void postDataToServer() {
	HashMap<String, Object> map=new HashMap();
	map.put("createdBy", "Nagender");
	map.put("status", "created");
	map.put("teamSize", 0);
	map.put("projectName", "Ruuba2");
	given().contentType(ContentType.JSON)
	.body(map)
	.post("http://106.51.90.215:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
	}
}
