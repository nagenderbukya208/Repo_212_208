package practice.ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;
import junit.framework.Assert;

public class VerifyData_complexJsonxpath {
	@Test
	public void sampleTest() {
		Response resp = given().get("http://106.51.90.215:8084/projects1");
		//resp.then().log().all();
		List<String> list = JsonPath.read(resp.asString(), ".content[*].projectName");
		for(String data:list) {
		System.out.println(data);  
   }
		List<String> list1 = JsonPath.read(resp.asString(), ".content[*].[?(@.projectName=='Fireflink_GAoTO')].projectId");
      //  System.out.println(list1.get(0));
        String actProjectId=list1.get(0);
        Assert.assertEquals(actProjectId,"80403" );
	}
}
