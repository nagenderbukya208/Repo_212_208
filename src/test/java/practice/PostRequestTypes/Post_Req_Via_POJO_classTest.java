package practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.utility.ProjectPojo;

public class Post_Req_Via_POJO_classTest {
@Test
public void postDataToServer() {
	// Create an object to pojo class
	Random random= new Random();
	int ranNum=random.nextInt(5000);
	//API-1 ==> add a Project in side server
	ProjectPojo pobj= new ProjectPojo("Jio_"+ranNum, "created", "Nagender", 8);
	Response resp= given()
	.contentType(ContentType.JSON)
	.body(pobj)
	.post("http://106.51.90.215:8084/addProject");
	resp.then().assertThat().statusCode(201).log().all();
	//Capture projectName from Response
String projectId=	resp.jsonPath().get("projectId");
System.out.println(projectId);
//API-2 Delete project
given().delete("http://106.51.90.215:8084/projects/"+projectId)
.then().log().all();

}
}
