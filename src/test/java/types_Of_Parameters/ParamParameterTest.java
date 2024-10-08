package types_Of_Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ParamParameterTest {
	@Test
	public void sampleTest() {
		given()
		.param("teamSize", "10")
		.log().all()
		.when()
		.get("http://49.249.28.218:8091/project")
		.then()
		.log().all();
   }
}
