package dataDrivenTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProjTest {
@Test(dataProvider ="getData")
public void sampleTest(String projectName, String status) {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Charan");
	jobj.put("status", ""+status);
	jobj.put("teamSize", 0);
	jobj.put("projectName", ""+projectName);
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.when()
	.post("http://106.51.90.215:8084/addProject")
	.then()
	.log().all();
}
@DataProvider
public Object[][] getData() throws Throwable {
	ExcelUtility eLib= new ExcelUtility();
int rowCount=eLib.getRowcount("Sheet1");
	Object[][] objArr= new Object[rowCount][2];
	for(int i=0; i<rowCount;i++) {
		objArr[i][0]=eLib.getDataFromExcel("Sheet1", i+1, 0);
		objArr[i][1]=eLib.getDataFromExcel("Sheet1", i+1, 1);
	}
	return objArr;
}
}
