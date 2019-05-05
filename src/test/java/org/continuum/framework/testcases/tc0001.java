package org.continuum.framework.testcases;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.continuum.framework.pages.Login;


public class tc0001 extends Common {

	//Correct username & password & landed on correct page /
	
	public void tc1() throws InterruptedException
	{
		
		Login Log = new Login(driver);
		Log.enterEmail("robinsbhogal31@gmail.com");	
		Log.password("ROBIN100");
		Log.loginbutton();
		
		LandingPage LP = new LandingPage(driver);
		LP.pageTitle();
		String title = driver.getTitle();
		Assertion Ass = new Assertion();
        assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);
        
        
        
       
        
	}

	
	
}
