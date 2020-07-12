package AndroidAutomation.AndroidAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SimpleLaunchApplication 
{

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("this is test");
		SimpleLaunchApplication mob = new  SimpleLaunchApplication();
		 mob.Appiumlaunch();
		System.out.println("This is main Method ");


	}
	 public void Appiumlaunch() throws MalformedURLException
	    {
	   	 DesiredCapabilities cap = new DesiredCapabilities();
	   	  cap.setCapability("platformVersion", "10.0.0");
	   	  cap.setCapability("platformName", "Android");
	   	  cap.setCapability("deviceName", "Galaxy A7 (2018)");
	   	  cap.setCapability("udid", "3200ba764615c529"); 
	   	  cap.setCapability("app", "C:\\Users\\Dell\\Downloads\\HRAcuity_Prod_1.0.5(20)\\HRAcuity_Prod_1.0.5(20).apk"); 
	   	  cap.setCapability("adbExecTimeout", "60000");
	   	  cap.setCapability("fullReset", "true");
	   	  
	   	  URL appiumurl = new URL("http://127.0.0.1:4723/wd/hub");
	   	  
			AppiumDriver   Driver = new AndroidDriver (appiumurl,cap);
			System.out.println("Application Launched");
	
	    }
	
}
