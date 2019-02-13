package com.genericpackege;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCall {

//private static final TimeUnit Timeunit.seconds = null;

public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;//that is interface, can not create variable but can create reference (driver is here the folder name)
		
System.setProperty("webdriver.chrome.driver","/Users/sumaiya/Desktop/chromedriver");
		
driver = new ChromeDriver();
driver.get("https://www.amazon.com");//this is abstract method
driver.manage().window().maximize();
driver.getTitle();
System.out.println(driver.getTitle());


driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("sumis0991@gmail.com");
driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("sumiusa2096");
driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// We solve syncronization issue by two ways wait(3 types) and sleep
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//Thread.sleep(5000);
//explicit wait
// fluent wait


		if(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
		
	System.out.println("test pass");
				
		} else // if else is a control statement
			System.out.println("test fail");
		

		 
		
}//end of method

}
//end of class
