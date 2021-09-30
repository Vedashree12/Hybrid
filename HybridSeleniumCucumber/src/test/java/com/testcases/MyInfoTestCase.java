package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseclass.*;
import com.pages.LoginPage;
import com.pages.MyInfo;
import com.seleniumResuableFunctions.SeleniumUtilities;

public class MyInfoTestCase extends Library {
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
    @Test(sequential = true)
    public void getinfo() {
    	LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");
    	
        MyInfo ipage=new MyInfo(driver);
        ipage.getMyinfo();

    }
    @AfterClass
    public void close() throws IOException {
        SeleniumUtilities sUti1 = new SeleniumUtilities(driver);
        sUti1.to_take_screenshot("src\\test\\resources\\ScreenShots\\orangeHRMLogin1.png");

        

    }


}
