package requestChaining;

import java.util.Random;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import pojoClass.utility.EmployePOJO;
import pojoClass.utility.ProjectPojo;

public class Scenario_2_AddEmployeToProject {
@Test
public void sampleTest() {
	//create an object to POJO class
	Random random= new Random();
   int ran=	random.nextInt(5000);
   // API-1 ==> add a project in inside server
   ProjectPojo pro= new ProjectPojo("TATADocoMo"+ran, "created", "Nagender", 0);
   Response resp= given()
    .contentType(ContentType.JSON).body(pro).when().post("http://49.249.28.218:8091/addProject");
   resp.then().assertThat().statusCode(201).and().assertThat().body("msg", Matchers.equalTo("Successfully Added"))
   .log().all();
   //capture projectName from the response
   String projectName= resp.jsonPath().getString("projectName");
   System.out.println(projectName);
   //API-2 ==> add employee to same project
   EmployePOJO emp= new EmployePOJO("TestEngg", "27/04/1999", "nag212@gmail.com", "charan_"+ran, 3.2, "9876543210", projectName, "ROLE_EMPLOYEE", "charan"+ran);
           given()
		   .contentType(ContentType.JSON)
		   .body(emp)
		   .when().post("http://49.249.28.218:8091/employees")
           .then()
           .assertThat().statusCode(201)
           .log().all();
   
}
}
