package com.Reka.rest_assured_training;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class SampleGetRequest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response=RestAssured.get("http://www.google.co.in");		
		//response.statusCode();
		int statusCode=response.statusCode();
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		String statusLine=response.statusLine();
		System.out.println(statusCode);
		//200
		System.out.println(statusLine);	
		//HTTP/1.1 200 OK
	}
}