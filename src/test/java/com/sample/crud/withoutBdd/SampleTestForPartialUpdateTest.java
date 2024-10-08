package com.sample.crud.withoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPartialUpdateTest {
	@Test
	public void postDataToServer() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Ngdr");

	RequestSpecification req= RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jobj.toJSONString());

	Response resp= req.patch("http://106.51.90.215:8084/projects/TY_PROJ_11717");
	resp.then().log().all();
	resp.then().assertThat().statusCode(200);

	}
	}

