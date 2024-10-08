package com.sample.crud.withBDDtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleTestForReadTest {
@Test
public void getDataFromServer() {
	given().get("http://106.51.90.215:8084/projects")
	.then().assertThat().statusCode(200)
    .log().all();
}
}
