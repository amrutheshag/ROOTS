package com.VIPS.test;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import com.VIPS.page.Home_Page;

public class Gift_Card extends BaseTest
{
	
	@Test
	public void Credit_Card_Guest_User(){
		
	Home_Page H=new Home_Page(driver);
		H.popup();
		H.Women_Catagory();
		
	}
	}
