package com.Reka.rest_assured_training;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleGetRequsetTestNG
{
	@Test
	public void getRequestTestNG()
	{
	Response response=	RestAssured.get("https://reqres.in/api/users/2");
	System.out.println(response.getTime());
	System.out.println(response.getTime());
	System.out.println(response.getStatusCode());
	System.out.println(response.statusLine());
	System.out.println(response.getHeader("content-type"));
	ResponseBody responseBody=response.getBody();
	//response.body()
	//System.out.println(responseBody.asString());
	System.out.println(responseBody.prettyPrint());
	//asPrettyString();
	
	// ASSERTION
	int statusCode=response.getStatusCode();
	Assert.assertEquals(statusCode, 200);
	}
	
	
@Test
public void test_1() {
	
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getTime());
	System.out.println(response.getTime());
	System.out.println(response.getStatusCode());
	System.out.println(response.statusLine());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getBody().prettyPrint());
	System.out.println(response.getBody().asString());
}

}
