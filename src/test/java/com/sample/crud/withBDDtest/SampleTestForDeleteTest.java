package com.sample.crud.withBDDtest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class SampleTestForDeleteTest {
	@Test
	public void deleteDataToServer() {
		given().delete("http://106.51.90.215:8084/projects/TY_PROJ_11673")
		.then().assertThat().statusCode(204)
		.log().all();
	}
	}
