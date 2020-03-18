package main_Classes;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserUtility 
{
	
	public static WebDriver Launch_Browser(WebDriver driver,String browserName,String url) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\Load_check\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}	
	

}
