package com.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazonPageFactory.AmazonPageFactory;

public class GenericClass {
	
	AmazonPageFactory pf;//pf  Reference variable of AmazonPageFactory Class, create korlam then, import
	WebDriver Driver;// driver is a reference variable of WebDriver interface, create korlam
	
public void getSet() {
	System.setProperty("webdriver.chrome.driver","/Users/sumaiya/Desktop/chromedriver");
	Driver=new ChromeDriver();//import korbo
	Driver.get(pf.getUrl());
	Driver.manage().window().maximize();
}
	public void signin() {
		pf.getClicksignin().sendKeys(pf.getUname());
		pf.getUsername().sendKeys(pf.getUname());//getUsername select username EditBox xpath then sendkey() send the userName String
		pf.getPass().sendKeys(pf.getUpass());//Box ashe na?
		pf.getClicksignin().click();
		
	}
	
	
	
	

}
