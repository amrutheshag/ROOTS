package com.roots.test;


import org.testng.annotations.Test;

import com.roots.page.LoginPage;

import generic.BaseTest;
import generic.Excel;
import generic.Retry;

public class Reg_User extends BaseTest
{
	
	@Test (retryAnalyzer=Retry.class,priority=2)
	public void Registered_User(){
		String un=Excel.getCellValue(XLPATH,"credentials",2,2);
		String pw=Excel.getCellValue(XLPATH,"credentials",3,2);
	
		LoginPage l=new LoginPage(driver);
		l.popup();
		l.Click_on_Header();
		l.Click_on_Login();
		l.enterUserName(un);
		l.enterPassword(pw);
		l.click_Signin();
		l.click_HomePagelogo();
	}
}
