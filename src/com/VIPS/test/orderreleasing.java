package com.VIPS.test;
import com.VIPS.page.EnterQueuemanagerpage;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;

public class orderreleasing extends BaseTest
{

	@Test()
	public void order_page() throws Exception{
		String un=Excel.getCellValue(XLPATH,"credentials",2,2);
		String pw=Excel.getCellValue(XLPATH,"credentials",3,2);
//		int rc=Excel.getRowCount(XLPATH,"order_number");
//		for(int i=1;i<=rc;i++)
//		{
		String E_order_number=Excel.getCellValue(XLPATH,"order_number",1,1);
//		String E_status=Excel.getCellValue(XLPATH,"order_status",1,1);
				
//		LoginPage l=new LoginPage(driver);
//		l.enterUserName(un);
//		l.enterPassword(pw);
//		l.clickLogin();
		
		EnterQueuemanagerpage p=new EnterQueuemanagerpage(driver);
		p.clickshow_all_status_Checkbox();
		p.entering_Order_Number(E_order_number);
		p.search_button();
		p.checking_order_number_status(E_order_number);
		p.New_status(E_order_number);
		p.other_status();
//		p.click_on_order_number();
		
	}
	}
//}
