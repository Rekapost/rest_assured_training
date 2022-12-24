package com.Reka.rest_assured_training;
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
	ResponseBody responseBody=response.getBody();
	//response.body()
	//System.out.println(responseBody.asString());
	System.out.println(responseBody.prettyPrint());
	//asPrettyString();
	}
	

}
