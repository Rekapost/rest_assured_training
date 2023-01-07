package com.Reka.rest_assured_training;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class SamplePostRequest 
{
	@Test(enabled=false)
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
			.post("/users")
		.then()
		     .statusCode(201);
	}
	
	@Test
	public void testPost() {
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("name", "Reka");
//		map.put("job", "NV");
//		System.out.println(map);
		
//		JSONObject jsonObject=new JSONObject(map);
//		System.out.println(jsonObject.toJSONString());
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "Reka");
		jsonObject.put( "job","Narayanasamy");
		System.out.println(jsonObject.toString());
		RestAssured.baseURI="https://reqres.in/api";
		ValidatableResponse response=RestAssured
		 .given()
		 	.header("Content-Type","application/json")
		 	// [contentType(ContenTtype.JSON)      
		 	//.accept(ContenTtype.JSON)]
		  	.body(jsonObject.toString())
		 .when()
		 	.post("/users")
		 .then()
	     	.statusCode(201).log().all();
	}
	
}
