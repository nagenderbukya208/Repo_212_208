package com.sample.crud.withoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForDeleteTest {
	@Test
	public void deleteDataToServer() {


	Response resp= RestAssured.post("http://106.51.90.215:8084/projects/TY_PROJ_11732");
	resp.then().log().all();
	resp.then().assertThat().statusCode(204);

	}
	}
