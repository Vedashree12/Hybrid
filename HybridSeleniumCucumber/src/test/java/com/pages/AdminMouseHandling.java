package com.pages;
import com.baseclass.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminMouseHandling extends Library{
	 @FindBy(id="menu_admin_viewAdminModule")
	    WebElement admin;
	 @FindBy(id="menu_admin_Job")
	    WebElement job;
	 @FindBy(id="menu_admin_jobCategory")
	    WebElement jobcategories;
	 public AdminMouseHandling(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);


	}

	
	
	public void adminMH() {
		 
		  Actions action=new Actions(driver);
		  action.moveToElement(admin).perform();
		  action.moveToElement(job).perform();	
		  action.moveToElement(jobcategories).click().build().perform();
	}

}
