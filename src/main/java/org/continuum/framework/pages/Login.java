package org.continuum.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.continuum.framework.base.Myutils;

public class Login extends Myutils{

	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String emailname)
	{
	driver.findElement(By.xpath(rb.getString("Emailid_Xpath"))).sendKeys(emailname);
	
	
	}
	
	public void password(String Password)
	{
	
		driver.findElement(By.xpath(rb.getString("Password_Xpath"))).sendKeys(Password);
	}
	
	public void loginbutton()
	{
		driver.findElement(By.xpath(rb.getString("Signinnbutton_Xpath"))).click();
	}
	
	public void invalidcredentailsmessage()
	{
		driver.findElement(By.xpath("InvalidCredentialMessage_Xpath")).click();
		WebElement s= driver.findElement(By.xpath("InvalidCredentialMessage_Xpath"));
		s.getText();
		System.out.println(s);
	}
	
	public void forgotPassword()
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
	}
	
	public void emailMobile(String input)
	{
		driver.findElement(By.xpath("EmailMobilenumber_Xpath")).sendKeys(input);
	}
	
	public void continueButton()
	{
		driver.findElement(By.xpath("ContinueButton_Xpath")).click();
	}
	
	public void customerService()
	{
		driver.findElement(By.linkText("CustomerService_link")).click();
		String S =driver.getTitle();
		System.out.println(S);
	}
}
