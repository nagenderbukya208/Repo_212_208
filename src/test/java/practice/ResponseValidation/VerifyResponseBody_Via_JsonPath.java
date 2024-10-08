package practice.ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
public class VerifyResponseBody_Via_JsonPath {
@Test
public void sampleTest() {
	Response resp=given()
     .get("http://106.51.90.215:8084/projects1");
	 resp.then().log().all();
	 resp.then().assertThat().body("numberOfElements",Matchers.greaterThanOrEqualTo(20));
	 resp.then().assertThat().body("pageable.sort.unsorted",Matchers.equalTo(true));
	 resp.then().assertThat().body("content[0].projectId", Matchers.equalTo("06151"));
	ArrayList<String> list= resp.jsonPath().get("content[*].projectId");
	System.out.println(list);
	/*int data= resp.jsonPath().get("numberOfElements");
	System.out.println(data);
	boolean data1= resp.jsonPath().get("pageable.sort.unsorted");
	System.out.println(data1);
	String data2= resp.jsonPath().get("content[0].projectId");
	System.out.println(data2);*/

}
}
