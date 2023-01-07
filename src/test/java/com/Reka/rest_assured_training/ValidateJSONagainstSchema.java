package com.Reka.rest_assured_training;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;   //***

//1. get api link and open in browser 
//2. copy all
//3. open json to json converter link
//4. paste all from 2 into 3  => click generate schema=> schema will be generated , copy all
//5. got to target of the project => properties=> click folder icon=> 
//go the target =>classes=> open rich text documenet and paste the schema and name as schema.json and save 

public class ValidateJSONagainstSchema {

	@Test
	public void test3() {
	baseURI="https://reqres.in/api";
	given()
	 .get("/users?page=2")
	.then()
	 .assertThat()
	 .body(matchesJsonSchemaInClasspath("/rest_assured_training/target/schema.json"))	       //***	
	 .statusCode(200);	 
	}
}
