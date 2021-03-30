package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 
public class testcase {
	WebDriver driver;
	
	@BeforeMethod
	public void T1()
	{
		System.out.println("---TEST CASE START---");
	}
	
	@AfterMethod
	public void T2()
	{
		System.out.println("---TEST CASE END---\n");
	}
	
	@BeforeClass
	public void T0()
	{
		System.out.println("---TEST START---\n");
	}
	
	@AfterClass
	public void T3()
	{
		System.out.println("---TEST END---\n");
	}
	
	@Test(priority = 1, description = "opening the website")
	public void login() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Desktop\\geckodriver.exe");
	    driver = new FirefoxDriver();  
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    System.out.println("a");
	}

	@Test(priority = 2, description = "maximizing the window", dependsOnMethods = "login")
	public void max() {
		driver.manage().window().maximize();
	    System.out.println("b");

	}

	@Test(priority = 3)
	public void Verify() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    System.out.println("c");


	}

	@Test(priority = 4, enabled = true)
	public void lose(){
		driver.close();
	    System.out.println("d");


	}


}