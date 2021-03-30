package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		mydriver.manage().window().maximize();
		mydriver.findElement(By.id("carRelbtn")).click();
		mydriver.findElement(By.linkText("New Car Loan")).click();
		mydriver.findElement(By.name("CUSTFIRSTNAME")).sendKeys("Manzar");
		mydriver.findElement(By.name("CUSTLASTNAME")).sendKeys("Hussain");
		mydriver.findElement(By.name("MOBILENUM")).sendKeys("9760542563");
		/*JavascriptExecutor js = (JavascriptExecutor) mydriver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement firstname = mydriver.findElement(By.id("logInPanelHeading"));
		String s = firstname.getText();
		System.out.println(s);
		*/
		mydriver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("MUMBAI");
		mydriver.findElement(By.id("residancebtn")).click();
		mydriver.findElement(By.linkText("Owned")).click();
		mydriver.findElement(By.id("yrbtn")).click();
		mydriver.findElement(By.linkText("2018")).click();
		mydriver.findElement(By.id("mnthbtn")).click();
		mydriver.findElement(By.linkText("Mar")).click();
		mydriver.findElement(By.id("DATEOFBIRTH")).sendKeys("16/10/1998");
		mydriver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("TATA ALTROZ XZ");
		//mydriver.findElement(By.id("CAR_MODEL_PRIZE")).sendKeys("1000000");
		
		//mydriver.findElement(By.id("IDV")).sendKeys("500000");
		
		mydriver.findElement(By.id("CITY_NAME")).sendKeys("Mumbai");
		Thread.sleep(500);
		mydriver.findElement(By.id("CITY_NAME")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		mydriver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ENTER);
		
		mydriver.findElement(By.id("CAR_MODEL_PRIZE")).click();
		
        JavascriptExecutor js = (JavascriptExecutor) mydriver;
		js.executeScript("window.scrollBy(0,1000)");
		
		mydriver.findElement(By.id("selSalbtn")).click();
		mydriver.findElement(By.linkText("Salaried")).click();
		
		mydriver.findElement(By.id("EMPLOYERNAME")).sendKeys("ICICI BANK LTD");
		Thread.sleep(500);
		mydriver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		mydriver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ENTER);
		
		mydriver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("50000");
		mydriver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("47500");
		
		mydriver.findElement(By.id("yrbtn")).click();
		Thread.sleep(500);
		mydriver.findElement(By.id("yrbtn")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		mydriver.findElement(By.id("yrbtn")).sendKeys(Keys.ENTER);
		
		//mydriver.findElement(By.linkText("2017")).click(); 
		
		mydriver.findElement(By.xpath("//*[@id=\"yrbtn\"]")).click();
		Thread.sleep(500);
		mydriver.findElement(By.xpath("//*[@id=\"yrbtn\"]")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		mydriver.findElement(By.xpath("//*[@id=\"yrbtn\"]")).sendKeys(Keys.ENTER);
		
		//mydriver.findElement(By.linkText("Mar")).click();
		
		mydriver.findElement(By.id("eligibility-btn")).click();
		
		mydriver.findElement(By.id("twbtn")).click();
		Thread.sleep(500);
		mydriver.findElement(By.id("twbtn")).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		mydriver.findElement(By.id("twbtn")).sendKeys(Keys.ENTER);
		
		//mydriver.findElement(By.id("eligibility-btn")).click();
		
		
		
	}

}
