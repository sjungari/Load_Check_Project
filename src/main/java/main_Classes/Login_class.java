package main_Classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;


public class Login_class extends Locators_Store 
{

    static WebDriver driver;
	
	public Login_class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public  void loginUsers(WebDriver driver,String uname,String pass,String tc_num,ExtentTest test) throws Exception
		{
		
		    Locators_Store loc=PageFactory.initElements(driver, Locators_Store.class);
		    Thread.sleep(2000);
			Login_or_SignUp.click();
			User_name.sendKeys(uname);
			password.sendKeys(pass);
			
			/*String path=Screenshots.captureScreenshot(driver, "username_and_password", tc_num);
			test.pass("Carrier Details Tab", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
			Thread.sleep(2000);*/
			signIN.click();
			Thread.sleep(2000);
			
			//loc.close_admin_page.click();
			   
			//Thread.sleep(2000);
		 }
	
}
