package org.continuum.framework.testcases;
import org.testng.annotations.Test;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.Login;
import org.continuum.framework.pages.LandingPage;


public class TC0003  extends Common{
	
    
	public void tC3() throws InterruptedException
	{
		
		Login Log = new Login(driver);		
		Log.enterEmail("robinsbhogal31@gmail.com");
		Log.password("ROBIN100");
		Log.loginbutton();
		Thread.sleep(10000);
		LandingPage LP = new LandingPage(driver);
		Thread.sleep(10000);
		LP.searchItem("Phone");
	
	   // LP.searchItem("Samsung Phone");
	//	LP.searchbuttonclick();
	}

}




