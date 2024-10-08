package requestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.utility.ProjectPojo;

public class Scenario_1_Delete_Project {
@Test
public void postDataToServer() {
	// Create an object to pojo class
	Random random= new Random();
	int ranNum=random.nextInt(5000);
	ProjectPojo pobj= new ProjectPojo("DocoMo"+ranNum, "created", "Nagender", 8);
	Response resp= given().contentType(ContentType.JSON)
	.body(pobj)
	.post("http://106.51.90.215:8084/addProject");
	resp.then().assertThat().statusCode(201)
	.and()
	.assertThat().body("msg", Matchers.equalTo("Successfully Added"))
	.log().all();
	//capture project Id from the response
	String projectId= resp.jsonPath().getString("projectId");
	System.out.println(projectId);
	//API-2 delete project
	given().delete("http://106.51.90.215:8084/projects/+projectId")
	.then().log().all();
}
}
