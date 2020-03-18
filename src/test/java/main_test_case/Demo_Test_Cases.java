package main_test_case;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import main_Classes.BrowserUtility;
import main_Classes.Load_Count_Function;
import main_Classes.Login_class;
import main_Classes.Read_Excel;
import main_Classes.Write_Excel;

public class Demo_Test_Cases 
{
	WebDriver driver;
	ExtentTest test;
	
     @BeforeTest
     public void launch_browser() throws Exception
     {
    	System.out.println("Launch The Browser");
     }
   
      @Test(dataProvider="performance")
 	  public void testcases_document_count(String tc_num,String browser,String envoirnment,String module,String uname,String pass,String url) throws Exception
 	  {
    	  if(envoirnment.equalsIgnoreCase("Staging"))
    	  {
    	 driver=BrowserUtility.Launch_Browser(driver, "Chrome", "https://staging.www.shipco.com/");
    	  
         Login_class login=new Login_class(driver);
    	 
    	 login.loginUsers(driver, uname, pass, tc_num, test);
    	 	 
    	 driver.navigate().to(url);
		 
    	 Load_Count_Function count=new Load_Count_Function(driver);
    	 Long count_store=count.load_count();
 		
    	 Write_Excel writedata=new Write_Excel();
         writedata.write_second_into_excel(tc_num,browser,envoirnment,module,uname,pass,url,count_store);
    	  }
    	  else
    	  {
    		  driver=BrowserUtility.Launch_Browser(driver, "Chrome", "https://www.shipco.com/");
        	  
    	         Login_class login=new Login_class(driver);
    	    	 
    	    	 login.loginUsers(driver, uname, pass, tc_num, test);
    	    	 	 
    	    	 driver.navigate().to(url);
    			 
    	    	 Load_Count_Function count=new Load_Count_Function(driver);
    	    	 Long count_store=count.load_count();
    	 		
    	    	 Write_Excel writedata=new Write_Excel();
    	         writedata.write_second_into_excel(tc_num,browser,envoirnment,module,uname,pass,url,count_store);
    	  }
 	}
 	
      @DataProvider(name="performance")
  	public Object readData_From_Excel_with_login_docs() throws Exception
  	{
  		return Read_Excel.read_excel("SHIP_831");
  		
  	}
 	
 	@AfterTest
 	public void tearDown()
 	{
 	     System.out.println();
 	}
 	
 	 @AfterMethod
 	 public void getResult()
 	 {
 	 
 	  driver.quit();   
 	 }	
     
   
}
