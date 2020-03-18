package main_Classes;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators_Store 
{
	  @FindBy (xpath="//*[text()='Get instant access to our online portal']")
	  public WebElement Login_or_SignUp;
			
	  @FindBy (xpath="//*[@id='cHdrUsername']")
	  public WebElement User_name;
			
	  @FindBy (xpath="//*[@id='cHdrPassword']")
	  public WebElement password;
			
	  @FindBy (xpath="//*[text()='Log In']")
	  public WebElement signIN;

	  @FindBy (xpath="//*[text()='Quick Ship']//preceding::a[3]")
	  public WebElement close_admin_page;
	  
	  @FindBy (xpath="//*[@id='userMenuContainer']/div/span/a[2]/i")
	  public WebElement open_Admin_menu;
	  
	  @FindBy (xpath="//*[text()='Global Locations']")
	  public WebElement global_location_menu;
	  
	  @FindBy (xpath="//*[text()='Global Locations']//following::a[1]")
	  public WebElement add_sign_for_global_loc;
	  
	  @FindBy (xpath="//*[text()='Global Locations']//following::a[2]")
	  public WebElement edit_sign_for_global_loc;
	  
	  @FindBy (xpath="//*[@id='cType']")
	  public WebElement company_type;
	  
	  @FindBy (xpath="//*[@id='cCompanyname']")
	  public WebElement company_name;
	  
	  
	  @FindBy (xpath="//*[@id='cLoc']")
	  public WebElement enter_loc_code;
	  
	  @FindBy (xpath="//*[@class='ui-menu-item']/a")
	  public WebElement sel_loc_code;
	  
	  @FindBy (xpath="//*[@id='cAddress']")
	  public WebElement address;
	  
	  @FindBy (xpath="//*[@id='cCity']")
	  public WebElement city;
	  

	  @FindBy (xpath="//*[@id='cState']")
	  public WebElement state;
	  
	  @FindBy (xpath="//*[@id='cCountry']")
	  public WebElement country;
	  
	  @FindBy (xpath="//*[@id='cLatitude']")
	  public WebElement latitude;
	  
	  @FindBy (xpath="//*[@id='cLongitude']")
	  public WebElement longitude;
	  
	  @FindBy (xpath="//*[@id='cWebsite']")
	  public WebElement website;
	  
	  @FindBy (xpath="//*[@id='cNotes']")
	  public WebElement notes;
	  
	  @FindBy (xpath="//*[@id='cContinent']")
	  public WebElement continent;
	  
	  @FindBy (xpath="//*[@id='gblLocationsubmit']")
	  public WebElement submit_button;
	  
	  @FindBy (xpath="//*[text()='Agent']")
	  public WebElement agent;
	  
	  @FindBy (xpath="//*[text()='Agent']//following::a[2]")
	  public WebElement edit_agent_record_button;
	  
	  @FindBy (xpath="//*[text()='Action']//following::tr[1]/td[5]/span[1]")
	  public WebElement edit_img_inside_agent;
	  
	  @FindBy (xpath="//*[@id='cupdateCity']")
	  public WebElement city_inside_edit_agent;
	  
	  @FindBy (xpath="//*[@id='cupdateState']")
	  public WebElement state_inside_edit_agent;
	  
	  @FindBy (xpath="//*[@id='cupdateCountry']")
	  public WebElement country_inside_edit_agent;
	  
	  @FindBy (xpath="//*[@id='cupdateLocationcode']")
	  public WebElement locationCode_inside_edit_agent;
	  
	  @FindBy (xpath="//*[text()='Warehouses']")
	  public WebElement warehouses_menu;
	  
	  @FindBy (xpath="//*[text()='Warehouses']//following::a[2]")
	  public WebElement edit_button_for_warehouses;
	  
	  @FindBy (xpath="//*[@id='cLocationcode']")
	  public WebElement uncode;

	  @FindBy (xpath="//*[@id='cCity']//following::input[1]")
	  public WebElement go_button;
	  
	  
	  @FindBy (xpath="//*[@id='mainContentFrame']")
	  public WebElement frame_inside_warehouse;
	  
	  @FindBy (xpath="//*[@id='searchrecord']")
	  public WebElement search_branch;
	  
	  @FindBy (xpath="//*[text()='Branch']")
	  public WebElement branch_menu;
	  
	  @FindBy (xpath="//*[text()='Branch']//following::a[2]")
	  public WebElement edit_button_for_branch;
	  
	  @FindBy (xpath="//*[text()='Search Branch :']//following::tr[i]/td[9]/span[1]")
	  public WebElement edit_img_for_branch;
	  
	  //Agent locators for add record inside Agent
	  
	  @FindBy (xpath="//*[@id='cCode']")
	  public WebElement agent_code;
	  
	  @FindBy (xpath="//*[@id='cName']")
	  public WebElement agent_name;
	  
	  @FindBy (xpath="//*[@id='cContactperson']")
	  public WebElement agent_contact_person;
	  
	  @FindBy (xpath="//*[@id='cTel']")
	  public WebElement agent_tel_num;
	  
	  @FindBy (xpath="//*[@id='cLocationcode']")
	  public WebElement agent_loc_code;
	  
	  @FindBy (xpath="//*[text()='Agent']//following::a[1]")
	  public WebElement add_agent_record_button;
	  
	  @FindBy (xpath="//*[@id='newagentsubmit']")
	  public WebElement agent_submit_button;
	  
	  @FindBy (xpath="//*[@id='searchagentcode']")
	  public WebElement search_code_or_name;
	  
	  //locators for Branch Module
	  
	  @FindBy (xpath="//*[text()='Branch']//following::a[1]")
	  public WebElement add_button_for_branch;
	  
	  @FindBy (xpath="//*[@id='cCode']")
	  public WebElement b_code;
	  
	  @FindBy (xpath="//*[@id='cLoc']")
	  public WebElement b_loc_code;
	  
	  @FindBy (xpath="//*[@class='ui-menu-item']/a")
	  public WebElement sel_b_loc_code;
	  
	  @FindBy (xpath="//*[@id='cCompanyname']")
	  public WebElement b_comp_name;
	  
	  @FindBy (xpath="//*[@id='cType']")
	  public WebElement b_comp_type;
	  
	  @FindBy (xpath="//*[@id='cTel']")
	  public WebElement b_tel_num;
	  
	  @FindBy (xpath="//*[@id='cEmail']")
	  public WebElement b_email_id;
	  
	  @FindBy (xpath="//*[@id='cLatitude']")
	  public WebElement b_lati;
	  
	  @FindBy (xpath="//*[@id='cLongitude']")
	  public WebElement b_long;
	  
	  @FindBy (xpath="//*[@id='newbranchsubmit']")
	  public WebElement b_submit_button;
	  
	  //locators for warehouse
	  
	  @FindBy (xpath="//*[text()='Warehouses']//following::a[1]")
	  public WebElement add_button_for_warehouses;
	  
	  @FindBy (xpath="//*[@id='cLocationcode']")
	  public WebElement uncode_for_warehouse;
	  
	  @FindBy (xpath="//*[@id='cWarehousecmscode']")
	  public WebElement cms_code_for_warehouse;
	  
	  @FindBy (xpath="//*[@id='cWarehousename']")
	  public WebElement warehouse_name;
	  
	  @FindBy (xpath="//*[@id='cAddress']")
	  public WebElement add_for_warehouse;
	  
	  @FindBy (xpath="//*[@id='cCity']")
	  public WebElement city_for_warehouse;
	  
	  @FindBy (xpath="//*[@id='cDefaultwarehouse']")
	  public WebElement default_warehouse;
	  
	  @FindBy (xpath="//*[text()='Mode: ']//following::input[1]")
	  public WebElement go_button_for_warehouse;
	  
	  //locators for delete functionality
	  
	  @FindBy (xpath="//*[text()='Warehouses']//following::a[3]")
	  public WebElement delete_button_for_warehouses;
	  
	  @FindBy (xpath="//*[text()='Agent']//following::a[3]")
	  public WebElement delete_agent_record_button;
	  
	  @FindBy (xpath="//*[text()='Global Locations']//following::a[3]")
	  public WebElement delete_in_global_location;
	  
	  @FindBy (xpath="//*[text()='Branch']//following::a[3]")
	  public WebElement delete_button_for_branch;
	  
	  }
