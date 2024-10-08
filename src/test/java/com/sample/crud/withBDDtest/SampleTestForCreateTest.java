package com.sample.crud.withBDDtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class SampleTestForCreateTest {
@Test
public void postDataToServer() {
JSONObject jobj=new JSONObject();
jobj.put("createdBy", "Nagender");
jobj.put("status", "created");
jobj.put("teamSize", 0);
jobj.put("projectName", "Ngdr_Glatko2122");
given().contentType(ContentType.JSON)
.body(jobj.toJSONString())
.post("http://106.51.90.215:8084/addProject")
.then().assertThat().statusCode(201).log().all();
}
}
