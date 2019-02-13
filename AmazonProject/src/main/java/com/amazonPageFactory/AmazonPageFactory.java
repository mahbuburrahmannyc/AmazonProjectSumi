package com.amazonPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	
private String url="https://www.amazon.com/";
private String Uname="ssumaiya66@gmail.com";
private String upass="sumiusa2096";

@FindBy(xpath="//*[@id='nav-link-accountList']")// akhane ami webelement gulo ke private kore dilam
private WebElement Clicksignin;// source theke getter korbo

@FindBy(xpath="//*[@id='ap_email']")
private WebElement Username;

@FindBy(xpath="//*[@id='ap_password']")
private WebElement Pass;

@FindBy(xpath="//*[@id='signInSubmit']")
private WebElement SignIn;




public WebElement getSignIn() {
	return SignIn;
}
public WebElement getPass() {
	return Pass;
}
public WebElement getUsername() {
	return Username;
}
public WebElement getClicksignin() {
	return Clicksignin;
}
public String getUrl() {
	return url;
}
public String getUname() {
	return Uname;
}
public String getUpass() {
	return upass;
}

 


}
