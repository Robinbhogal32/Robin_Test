package org.continuum.framework.pages;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;






public class API {
	
	
	

	public void GetWeatherStatusLine()
	{
		RestAssured.baseURI = "http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners";
		 
		 RequestSpecification httpRequest = RestAssured.given();
		 
		 io.restassured.response.Response response = httpRequest.get("/50016821/products");
		 
		 System.out.println("Response Body is =>  " + response.asString());
		 }
	
public static boolean statusCodeVerification(){
	        
	        boolean result = false;
	        
	        io.restassured.response.Response resp= RestAssured.get("http://internal-entitlement-partnerspecific-72155629.ap-south-1.elb.amazonaws.com/entitlement/v1/partners/50016821/products");
	        
	        if(resp.getStatusCode() == 200){
	            result = true;
	            //System.out.println(result); 
	        }
	        
	        return result;
	        
	}
	}