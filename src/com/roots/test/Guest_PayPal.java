package com.roots.test;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import com.roots.page.Checkout_Page;
import com.roots.page.Home_Page;
import com.roots.page.LoginPage;

public class Guest_PayPal extends BaseTest  
{
	
	@Test (priority=1)
	
	public void Credit_Card_Guest_User(){
//		String un=Excel.getCellValue(XLPATH,"credentials",2,2);
//		String pw=Excel.getCellValue(XLPATH,"credentials",3,2);

		Home_Page H=new Home_Page(driver);
		H.Welecome_PopUp();
		H.Women_Catagory_Selection_To_Til_Cartpage();
	Checkout_Page C=new Checkout_Page(driver);
		C.CartpageTo_Til_OrderPlace();
		}
}
