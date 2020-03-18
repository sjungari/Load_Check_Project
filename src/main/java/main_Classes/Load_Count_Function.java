package main_Classes;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Load_Count_Function 
{
	 WebDriver driver;
	
	public Load_Count_Function(WebDriver driver)
	{
		this.driver=driver;
	}
	public  Long load_count() throws Exception
	{
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
    		    "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
				 
		long second=TimeUnit.MILLISECONDS.toSeconds(loadtime);
       System.out.println("Acutal Load Time IS in Second  "+second);
       return second;
       
       }

}
