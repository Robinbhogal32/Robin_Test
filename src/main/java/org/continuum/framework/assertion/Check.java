package org.continuum.framework.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Check {

	public static boolean checkElementExist(WebDriver driver, String id)
	{
		boolean b=false;
		try
		{
			driver.findElement(By.id(id));
			b=true;
		}
		catch(Exception e)
		{
			
		}
		return b;
	}
}
