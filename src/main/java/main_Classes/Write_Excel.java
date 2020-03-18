package main_Classes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;


public class Write_Excel 
{
	WebDriver driver;
	
	public Write_Excel()
	{
		
	}

	public void write_second_into_excel(String tc_num,String browser,String envoirnment,String module,String uname,String pass,String url,Long second) throws Exception
	{  
    	
       FileInputStream inputStream = new FileInputStream("D:\\Workspace\\Load_check\\resources\\Performance.xls");

       HSSFWorkbook wb = null;
       
       wb = new HSSFWorkbook(inputStream);

      HSSFSheet sheet = wb.getSheet("Result");

      int num = sheet.getLastRowNum(); 
      Row row = sheet.createRow(++num); 
      
      System.out.println(tc_num);
      System.out.println(browser);
      System.out.println(envoirnment);
      System.out.println(uname);
      System.out.println(pass);
      System.out.println(url);
      System.out.println(second);
      
      row.createCell(0).setCellValue(tc_num);
      row.createCell(1).setCellValue(browser);
      row.createCell(2).setCellValue(envoirnment);
      row.createCell(3).setCellValue(module);
      row.createCell(4).setCellValue(uname);
      row.createCell(5).setCellValue(pass);
      row.createCell(6).setCellValue(url);
      row.createCell(7).setCellValue(second+" "+"sec");
      
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println(dtf.format(now));
     
      System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
     
      if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<=11 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>=9)
     {
       System.out.println("AIRO");
       row.createCell(8).setCellValue("AIRO \n"+dtf.format(now));
     }
       else if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<=16 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>=12)
      {
         System.out.println("EURO");
         row.createCell(8).setCellValue("EURO  \n"+dtf.format(now));
      }
      else if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>=17 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<=19)
      {
         System.out.println("AMRO");
         row.createCell(8).setCellValue("AMRO  \n"+dtf.format(now));
      }
     
      FileOutputStream outputStream = new FileOutputStream("D:\\Workspace\\Load_check\\resources\\Performance.xls");
      wb.write(outputStream);
	
   }

 }
