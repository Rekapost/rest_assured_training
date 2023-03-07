package com.Reka.rest_assured_training;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SoapXMLrequestNOTWORKING {
	
	
	@Test
	public void soapXML_Request() throws FileNotFoundException {
		//File file= new File("C://Users//Reka//Desktop//New//soapui//add.txt");
		File file= new File("C://Users//Reka//eclipse-workspace//rest_assured_training//SoapRequest//add.txt");
		FileInputStream fileinputstream=new FileInputStream(file);
		
	 RestAssured.baseURI="http://www.dneonline.com/";
	 RestAssured.given()
	  .contentType("text/xml")
	  .accept(ContentType.XML)
	  // to get request body from a file
	  // create  a file with xml extension
	  .body(fileinputstream);
	 
	}
}

