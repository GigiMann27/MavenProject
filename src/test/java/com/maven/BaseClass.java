package com.maven;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 
public class BaseClass {

	    WebDriver driver;
	  
	    @Test
	    public void SetUp() {
	        
	        System.setProperty("webdriver.chrome.driver","/Users/Gurpreet/eclipse-workspace/com.syntaxstudents.qa/Drivers/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().fullscreen();
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
	
	

}
