package practice.ResponseValidation;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class VerifyResponseHeaderTest2 {
@Test
public void verifyHeader() {
Response resp=given()
	.get("http://106.51.90.215:8084/projects");
	resp.then().log().all();
	long timeTaken= resp.time();
	long timeTakenSec = resp.timeIn(TimeUnit.SECONDS);
	System.out.println(timeTaken);
	System.out.println(timeTakenSec);
//	resp.then().assertThat().time(Matchers.lessThan(2000L));
//	resp.then().assertThat().time(Matchers.greaterThan(300L));
	resp.then().assertThat().time(Matchers.both(Matchers.lessThan(800L)).and(Matchers.greaterThan(300L)));
}
}
