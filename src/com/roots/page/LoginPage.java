package com.roots.page;


import static org.testng.Assert.fail;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class LoginPage extends BasePage {
	@FindBy(xpath="//a[contains(text(),'CONTINUE SHOPPING')]")
	private WebElement Wlcm_popup;
	
	@FindBy(className="ui-icon ui-icon-closethick")
	private WebElement Popup_close_BTN;
	
	@FindBy(xpath="(//span[contains(text(),'Good')])[1]")
	private WebElement Header;
	
	@FindBy(xpath="(//a[contains(text(),'Login/Sign up')])[1]")
	private WebElement Login_BTN;
	
			
	@FindBy(id="dwfrm_login_username")
	private WebElement Email_TB;
	
	@FindBy(id="dwfrm_login_password")
	private WebElement pwTB;
	
	@FindBy(id="login")
	private WebElement SignIn_BTN;
	
	@FindBy(xpath="(//a[@href='https://dev.roots.com/ca/en/homepage'])[2]")
	private WebElement HomePage_BTN;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void popup(){
		sleep(1);
		Wlcm_popup.click();
	}
	
	public void Click_on_Header(){
		Header.click();
		sleep(2);
	}
	
	public void Click_on_Login(){
		Login_BTN.click();
		sleep(2);
	}
	
	
	public void enterUserName(String un){
		Email_TB.sendKeys(un);
		
	}
	
	public void enterPassword(String pw){
		pwTB.sendKeys(pw);
		
	}
	
	public void click_Signin(){
			sleep(1);
		
		SignIn_BTN.click();
		sleep(2);
	}
	public void click_HomePagelogo(){
		HomePage_BTN.click();
		Reporter.log("", true);
	}
//	catch (NoSuchElementException e) {
//	}
	
	}
