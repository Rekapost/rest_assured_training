package com.Reka.rest_assured_training;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class JsonValidationHamcrestMatchers {
	@Test(enabled=false)
	public void checkLeagueid()
	{
	get("http://localhost:3000/data").then().body("leagueId", equalTo(35));	
	}
	@Test(enabled=false)
	public void visitingTeam()
	{
	get("http://localhost:3000/data").then().body("visitingTeam", equalTo("India"));	
	}
	@Test(enabled=false)
	public void checkWeight()
	{
	get("http://localhost:3000/data").then().body("weight", equalTo(61.1f));	
	}
	@Test(enabled=false)
	public void checkTime()
	{
	get("http://localhost:3000/data").then().time(lessThan(1L),TimeUnit.SECONDS);	
	}
	@Test(enabled=false)
	public void checkEntries()
	{
	get("http://localhost:3000/odds").then().body("odds",hasSize(2));	
	}
	@Test(enabled=false)
	public void checkEmptyEntries()
	{
	get("http://localhost:3000/odds").then().body("odds",empty());	
	}
	
	@Test(enabled=false)
	public void test2() {
	baseURI="https://reqres.in/api";
	given()
	 .get("/users?page=2")
	.then()
	 .statusCode(200)
	 .body("data[1].id", equalTo(8))
	 .log().all();    // to log the results 	
	}
	
	@Test
	public void test3() {
	baseURI="https://reqres.in/api";
	given()
	 .get("/users?page=2")
	.then()
	 .statusCode(200)
	 .body("data[4].first_name", equalTo("George"))
	 .body("data.first_name", hasItems("George","Rachel"))
	 .log().all();    // to log the results 
	}
}

