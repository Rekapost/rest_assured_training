package com.Reka.rest_assured_training;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class JsonValidationHamcrestMatchers {
	@Test
	public void checkLeagueid()
	{
	get("http://localhost:3000/data").then().body("leagueId", equalTo(35));	
	}
	@Test
	public void visitingTeam()
	{
	get("http://localhost:3000/data").then().body("visitingTeam", equalTo("India"));	
	}
	@Test
	public void checkWeight()
	{
	get("http://localhost:3000/data").then().body("weight", equalTo(61.1f));	
	}
	@Test
	public void checkTime()
	{
	get("http://localhost:3000/data").then().time(lessThan(1L),TimeUnit.SECONDS);	
	}
	@Test
	public void checkEntries()
	{
	get("http://localhost:3000/odds").then().body("odds",hasSize(2));	
	}
	@Test
	public void checkEmptyEntries()
	{
	get("http://localhost:3000/odds").then().body("odds",empty());	
	}
}

