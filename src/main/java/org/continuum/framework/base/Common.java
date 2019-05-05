package org.continuum.framework.base;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Common {

	public WebDriver driver;
	
	@BeforeMethod
	public void bmet()
	{
		ResourceBundle rb= ResourceBundle.getBundle("Framework_Configuration");
		if(rb.getString("browser").equalsIgnoreCase("Firefox"))
		
	
		{
			driver = new FirefoxDriver();
			
			
		}
				
		else if(rb.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		{
			
		}
		
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.get("http://shop.thetestingworld.com/");
	}
	
	
	
	
	@AfterMethod
	public void amet()
	{
		driver.quit();
	}
	
}
