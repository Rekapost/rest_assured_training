package com.Reka.rest_assured_training;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class SamplePostRequest 
{
	@Test
	public void postRequestExample() 
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "Reka");
		jsonObject.put( "job","Narayanasamy");
		System.out.println(jsonObject.toString());
		
		RestAssured.baseURI="https://reqres.in/api";
		ValidatableResponse response=RestAssured		
		.given()
			.header("","")
			//.header("Content-Type","application/json")
			//.contentType(ContentType.JSON)
			//.accept(ContentType.JSON)
			.body(jsonObject.toJSONString())
		.when()
			.post("/usrs")
		.then()
		     .statusCode(201);
	}
}
