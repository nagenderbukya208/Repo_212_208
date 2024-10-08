package com.sample.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForReadTest {
@Test
public void getDataFromServer() {
	Response resp = RestAssured.get("http://106.51.90.215:8084/projects");
	resp.then().assertThat().statusCode(200);
	resp.then().log().all();
}
}
