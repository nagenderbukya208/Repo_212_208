package com.sample.crud.withBDDtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class SampleTestForPartialUpdateTest {
	@Test
	public void updatePartialDataToServer() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Naga_ngdr");
	
	given().contentType(ContentType.JSON)
	.body(jobj.toJSONString())
	.when().patch("http://106.51.90.215:8084/projects/TY_PROJ_11674")
     .then().assertThat().statusCode(200)
     .log().all();
	

	}
	}

