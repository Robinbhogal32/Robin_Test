package org.continuum.framework.testcases;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.API;
import org.testng.annotations.Test;

public class TC0008{
	
	@Test(groups = { "All", "P1" })
	public void TC0008()
	{
		API AP = new API();
		AP.GetWeatherStatusLine();
	}
	
	@Test(groups = { "All", "P1" })
	public void TC00081()
	{
		API AP = new API();
		AP.statusCodeVerification();
	}
	
	

}
