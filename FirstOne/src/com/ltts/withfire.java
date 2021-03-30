package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class withfire {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver mydriver = new FirefoxDriver();
		
		mydriver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		mydriver.manage().window().maximize();
		mydriver.findElement(By.className("btn-default")).click();
		mydriver.switchTo().alert().accept();
		mydriver.findElement(By.className("btn-lg")).click();
		mydriver.switchTo().alert().dismiss();
		//JavascriptExecutor js = (JavascriptExecutor) mydriver;
		//js.executeScript("window.scrollBy(0,10000)");
		mydriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(500);
		mydriver.switchTo().alert().sendKeys("OmPrakash");
		//JavascriptExecutor jexe = (JavascriptExecutor) mydriver;
		//jexe.executeScript("document.getElementById('username').value='username';");
		mydriver.switchTo().alert().accept();
		
		mydriver.get("http://demo.automationtesting.in/Frames.html");
		mydriver.manage().window().maximize();
		mydriver.switchTo().frame("SingleFrame");
		mydriver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Jai BOSDK");
		mydriver.switchTo().frame("MultipleFrame");
		
		//int size = mydriver.findElements(By.tagName("7i")).click();
		 
		 
	}
}
