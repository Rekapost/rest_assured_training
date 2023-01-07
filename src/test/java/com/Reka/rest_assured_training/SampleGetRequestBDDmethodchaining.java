package com.Reka.rest_assured_training;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SampleGetRequestBDDmethodchaining
{
	@Test
	public void getRequestBDD()
	{
	baseURI="https://reqres.in/api";
	ValidatableResponse response=
		given()	
			.param(" ", " ")
			.header(" "," ")
		.when()
			.get("/users/3")
		.then()
			.statusCode(200);
	    
		}
}
