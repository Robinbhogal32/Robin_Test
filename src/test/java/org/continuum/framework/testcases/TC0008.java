package org.continuum.framework.testcases;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.API;
import org.testng.annotations.Test;

public class TC0008{
	
	
	public void TC0008()
	{
		API AP = new API();
		AP.GetWeatherStatusLine();
	}
	
	
	public void TC00081()
	{
		API AP = new API();
		AP.statusCodeVerification();
	}

}
