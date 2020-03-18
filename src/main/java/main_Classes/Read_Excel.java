package main_Classes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;


public class Read_Excel 
{
	
	WebDriver driver;
	
	public static Object read_excel(String sheetName) throws Exception
	{
		File src=new File("D:\\Workspace\\Load_check\\resources\\Performance.xls");
		
	    FileInputStream finput = new FileInputStream(src);
	    Workbook workbook=Workbook.getWorkbook(finput);
	    Sheet s= workbook.getSheet(sheetName);
		 
	    int rows=s.getRows();
	    int cols=s.getColumns();
	    
	    System.out.println("Total Number of Rows    "+rows);
	    System.out.println("Total Number of Columns  "+cols);
	    System.out.println("");
	    
	    Object data[][]=new Object[rows-1][cols];
	    int i=0;
	    int j=0;
	    for(i=0;i<rows-1;i++)
	
	     {
	    	 for(j=0;j<cols;j++)
	    	 {	 
	    		 data[i][j]=s.getCell(j,i+1).getContents();
	    	 }
	    	 
	    	 System.out.println("TC NUM             "+data[i][0]);
    		 System.out.println("BROWSER      "+data[i][1]);
    		 System.out.println("ENVIRONMENT    "+data[i][2]);
    		 System.out.println("MODULE             "+data[i][3]);
    		 System.out.println("USER NAME              "+data[i][4]);
    		 System.out.println("PASSWORD           "+data[i][5]);
    		 System.out.println("URL          "+data[i][6]);
    
    	     System.out.println("..................................");
	     }
	    
	    return data;
	  
	}
}
