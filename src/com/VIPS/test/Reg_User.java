package com.VIPS.test;


import org.testng.annotations.Test;
import com.VIPS.page.LoginPage;
import generic.BaseTest;
import generic.Excel;

public class Reg_User extends BaseTest
{
	
	@Test
	public void Registered_User(){
		String un=Excel.getCellValue(XLPATH,"credentials",2,2);
		String pw=Excel.getCellValue(XLPATH,"credentials",4,2);
	
		LoginPage l=new LoginPage(driver);
		l.popup();
		l.Click_on_Header();
		l.Click_on_Login();
		l.enterUserName(un);
		l.enterPassword(pw);
		l.click_Signin();
	}
}
