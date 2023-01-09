
package com.app.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.Scenario4Page;
import com.app.pages.Scenario5Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apptest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	}
	@Test
	  public void verifyscenario4() throws InterruptedException {
			Scenario4Page sc4 =new Scenario4Page(driver);
			sc4.add_to_bag();
	  }
	
	@Test
	  public void verifyscenario5() throws InterruptedException {
		Scenario5Page sc5 =new Scenario5Page(driver);
		sc5.verify_login();
	  }
	 @AfterMethod
		public void tearDown() {
	  	driver.quit();
		}
}
