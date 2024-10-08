package com.sample.crud.withBDDtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleTestForCompleteUpdateTest {
	@Test
	public void postDataToServer() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Nagender");
		jobj.put("status", "created");
		jobj.put("teamSize", 0);
		jobj.put("projectName", "Glatko_Ngdr_Ngdr");
		given().contentType(ContentType.JSON).body(jobj.toJSONString())
				.put("http://106.51.90.215:8084/projects/TY_PROJ_11717")
				.then().assertThat().statusCode(200)
				.log().all();
	}
}
