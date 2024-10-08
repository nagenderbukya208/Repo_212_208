package practice.PostRequestTypes;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_Req_Via_JsonFile {
@Test
public void postDataToServer() {
	File fobj= new File("./pro.json");
	given().contentType(ContentType.JSON)
	.body(fobj)
	.post("http://106.51.90.215:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
}
}
