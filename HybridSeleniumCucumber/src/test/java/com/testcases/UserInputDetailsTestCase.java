package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.AdminMouseHandling;
import com.pages.InputUserDetails;
import com.pages.LoginPage;
import com.seleniumResuableFunctions.SeleniumUtilities;
import com.baseclass.*;
public class UserInputDetailsTestCase extends Library{
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
    @Test(sequential = true)
    public void login() {
    	LoginPage lpage=new LoginPage(driver);
       lpage.login("Admin", "admin123");
       InputUserDetails idetails=new InputUserDetails(driver);
       idetails.userInput("ABC","Admin","XYZ","Enabled");

    }
    @AfterClass
    public void close() throws IOException {
        SeleniumUtilities sUti = new SeleniumUtilities(driver);
        sUti.to_take_screenshot("src\\test\\resources\\ScreenShots\\orangeHRMLogin3.png");

        

    }

}
