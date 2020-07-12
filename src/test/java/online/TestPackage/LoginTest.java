package online.TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import online.basePackage.AppiumMainLaunch;
import online.pagePackage.LoginPage;

public class LoginTest extends AppiumMainLaunch
{
	public LoginTest() throws Throwable 
	{
		super();
		
	}
	  
	@BeforeTest()
	public void appiumServerStart() throws IOException
	{
		appiumServerstart();
		appiumLaunchCap();
	}
	
	
	@Test()
	public void login() throws Throwable
	{
		LoginPage Page = new LoginPage((AndroidDriver<WebElement>)driver);
		Page.loginApp();
	}
	
	@AfterTest()
	public void appiumStopServer()
	{
		appiumserverstop();
		
	}
}
