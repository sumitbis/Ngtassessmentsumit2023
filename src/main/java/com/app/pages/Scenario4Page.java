package com.app.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import properties.propertiesfil;

public class Scenario4Page {

	public static String urlsc4;
	WebDriver driver;
	public Scenario4Page(WebDriver driver) {
		this.driver = driver;
		
	}
	public void add_to_bag() throws InterruptedException {
		try {
			propertiesfil.getpropertyfile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		driver.get(urlsc4);
		//driver.findElement(By.id("mobileNumberPass")).sendKeys("8383863576");
		//driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("@Inazuma03");
		//driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
		driver.findElement(By.xpath("//*[contains(@data-reactid,'905')]")).click();
		String actual = driver.findElement(By.xpath("//div[@class='emptyCart-base-emptyDesc']")).getText();
		String expected = "There is nothing in your bag. Let's add some items.";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
		driver.findElement(By.xpath("//*[@class='logo-inline']")).click();
		driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("redmi");
		driver.findElement(By.xpath("//*[@class='desktop-submit']")).click();
		driver.findElement(By.xpath("//*[@class='img-responsive']")).click();
		Set<String> h=driver.getWindowHandles();
		for(String string : h) {
			driver.switchTo().window(string);
		}
		driver.findElement(By.xpath("//*[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@data-reactid,'905')]")).click();
		String actualbag=driver.findElement(By.xpath("//*[@class='bulkActionStrip-message']")).getText();
		String expectedbagItem ="1/1 ITEMS SELECTED";
		System.out.println(actualbag);
		Assert.assertEquals(actualbag, expectedbagItem);
	}
}
