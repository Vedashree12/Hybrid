package com.pages;
import com.baseclass.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfo extends Library {
	 @FindBy(xpath="//*[@id=\"menu_pim_viewMyDetails\"]/b")
	 WebElement myinfo;
	 public MyInfo(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
 }
	 
	 public void getMyinfo() {
	       myinfo.click();
	 
	 
	 }	 
}