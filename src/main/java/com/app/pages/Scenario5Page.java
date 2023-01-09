package com.app.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Scenario5Page {

	
	WebDriver driver;
	public Scenario5Page(WebDriver driver) {
		this.driver = driver;
	}
	public void verify_login() throws InterruptedException {
		//driver.get("https://www.myntra.com/login/password");
		
		
		driver.get("https://www.myntra.com/login/password");
		driver.findElement(By.id("mobileNumberPass")).sendKeys("8383863576");
		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("@Inazuma03");
		driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
		Thread.sleep(35000);
		driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[contains(@data-reactid,'853')]"));
		Actions act =new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[contains(@class,'desktop-infoTitle')]")).click();
		
		boolean confirm_profile = driver.getPageSource().contains("sumit bisht");
		System.out.println(confirm_profile);
		assertEquals(confirm_profile, true);
	}
}
