package org.continuum.framework.pages;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;


public class API {
	
	/* Get API output */
	public void GetWeatherStatusLine()
	{
		RestAssured.baseURI = "http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners";
		 
		 RequestSpecification httpRequest = RestAssured.given();
		 
		 io.restassured.response.Response response = httpRequest.get("/50016821/products");
		 
		 System.out.println("Response Body is =>  " + response.asString());
		 }
	
	
	/* Get API status code verification */
public void statusCodeVerification(){
	                
 RestAssured.baseURI = "http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners";
 RequestSpecification httpRequest = RestAssured.given();
 Response response = (Response) httpRequest.get("/50016821/products");
 
 //Response response = RestAssured.get("http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners/50016821/products/50016821/products");
 
 int statusCode = response.getStatusCode();
	
 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	        
	} 
	
public void geAPIDetails()
{   
// Specify the base URL to the RESTful web service
RestAssured.baseURI = "http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners";

// Get the RequestSpecification of the request that you want to sent
// to the server. The server is specified by the BaseURI that we have
// specified in the above step.
RequestSpecification httpRequest = RestAssured.given();

// Make a request to the server by specifying the method Type and the method URL.
// This will return the Response from the server. Store the response in a variable.
Response response = httpRequest.request(Method.GET, "/50016821/products");

// Now let us print the body of the message to see what response
// we have recieved from the server
String responseBody = response.getBody().asString();
System.out.println("Response Body is =>  " + responseBody);

}

}

	


	