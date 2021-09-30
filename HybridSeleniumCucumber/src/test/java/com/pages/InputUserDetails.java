package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.baseclass.*;
import com.seleniumResuableFunctions.SeleniumUtilities;

public class InputUserDetails extends Library{
	
	 @FindBy(id="searchSystemUser_userName")
	    WebElement Username;
	 @FindBy(id="searchSystemUser_userType")
	    WebElement Userroll;
	 @FindBy(id="searchSystemUser_employeeName_empName")
	    WebElement Empname;
	 @FindBy(id="searchSystemUser_status")
	    WebElement Status;
	 public InputUserDetails(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);


	}
	
	
	
	public void userInput(String un,String ur,String en,String st) {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
	    Username.sendKeys(un);
	    SeleniumUtilities  s1=new SeleniumUtilities(driver);
	    s1.dropdown(Userroll, ur);
	     Empname.sendKeys(en);
	     SeleniumUtilities  s2=new SeleniumUtilities(driver);
		    s2.dropdown(Status, st);
	}

}
