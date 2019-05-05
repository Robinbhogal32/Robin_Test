package org.continuum.framework.testcases;

import org.testng.annotations.Test;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.Login;

public class TC0002  extends Common  {
	
	
	public void tc2() throws InterruptedException
	{
		Login Log = new Login(driver);	
		Log.enterEmail("Robinsbhogal31@gmail.com");
		Log.password("Password1");
		Log.loginbutton();
		//Log.invalidcredentailsmessage();
		//Thread.sleep(10000);
	}}