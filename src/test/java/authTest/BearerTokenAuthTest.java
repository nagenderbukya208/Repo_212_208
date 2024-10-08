package authTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenAuthTest {
@Test
public void sampleTest() {
	given()
	.auth().oauth2("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJsZUN3YUNPai00RXVlbzJkTFFrTmZuLXh2M0F3Nm5ZdWZtS0pINXBFWkNNIn0.eyJleHAiOjE3MjA4Njc1MzYsImlhdCI6MTcyMDg2NTc1MSwianRpIjoiMjRjYzQ5OTMtMjRlNy00NTM2LWEzM2YtMjBhMWI2YzJhODI1IiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiNDAzNGQxYzYtN2EyZi00MTFjLWEwOTctNWY3NWNmMzYwZDk0IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiNDAzNGQxYzYtN2EyZi00MTFjLWEwOTctNWY3NWNmMzYwZDk0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.JKisbtqNZNY4pLRmkz12Vx0mypzxn1Ljy7N7lwodLHoY4zEgH6rE-7Q3vQe-G1XZYVmQfTfzvU4VTGLCq6pCtn0z5XR-nac0XDbh2r3uRH0RGS1f16CuAjvJ01Go-eRRIK8Kz9kr4v-p0MRq9mojsO-hy-NXFZ_-kBSQHYd1pK39Sk6kBgNNZVakVulWUKOvv9ZaGDAf245IDZRrtXQDMofgGsJcpoi9NcGOJ_wwMV78HO3w-gHF8SvzXAB1xW4Xf2rDq92eADnU6ow8pArAw7tVJHjM8FmR5woKL379dNh17qPDn7fOYZMNgkNmdC1x0ZIq9hmLuLjfa_zsMfZV-A")
	.log().all()
	.when()
	.get("http://49.249.28.218:8091/projects")
	.then()
	.log().all();
}
}