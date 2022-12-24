package com.Reka.rest_assured_training;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class SamplePutRequest {
	
	@Test
	public void putRequestExample()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "RekaNV");
		jsonObject.put("job", "Narayana");
		// text 
		System.out.println(jsonObject.toString());
		
		RestAssured.baseURI="https://reqres.in/api";
		ValidatableResponse response=RestAssured
		.given()
			.header("", "")
			//raw  json as in postman
			.body(jsonObject.toJSONString())
		.when()
			.put("/users/2")
			//.patch("/users/2")
		.then()
			.statusCode(200);
	}
	
	@Test
	public void deleteRequestExample()
	{
		RestAssured.baseURI="https://reqres.in/api";
		ValidatableResponse response=RestAssured
		.given()
			.header("", "")
		.when()
			.delete("/users/2")
		.then()
			.statusCode(204);	
	}
}
