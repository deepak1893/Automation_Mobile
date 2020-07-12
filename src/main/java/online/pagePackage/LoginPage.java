package online.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import online.basePackage.AppiumMainLaunch;

public class LoginPage extends AppiumMainLaunch{
	
	public LoginPage(AndroidDriver<WebElement> driver) throws Throwable
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
   

AppiumDriver driver;
	
	@AndroidFindBy(id = "com.hracuity.manageraccess:id/user_email_input")  // For IOS devices, the annotation will change to IOSFindBy
	public WebElement loginUsername;
	
	
	
	public void loginApp()
	{
		loginUsername.sendKeys("");
		
	}

}
