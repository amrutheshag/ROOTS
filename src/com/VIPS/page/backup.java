package com.VIPS.page;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class backup extends BasePage {

	@FindBy(xpath="//input[@ng-model=\"showAllStatuses\"]")
	private WebElement Show_All_Statuses;
	
	@FindBy(id="orderNumber")
	private WebElement Order_Number_textbox;
	
	@FindBy(xpath="//button[contains(text(),'SEARCH')]")
	private WebElement SEARCH_BTN;
	
	@FindBy(xpath="(//td[@class='ng-scope'])[6]")
	private WebElement A_order_number;
	
	@FindBy(xpath="//td[.='No data available in table']")
	private WebElement No_Data_status;
	
	
	
	@FindBy(xpath="(//th[.='Status'])[1]/../../../../../..//div[2]//span")
	private WebElement A_status;
	
	@FindBy(xpath="((//th[.='Status'])[1]/../../../../../..//div[2]//span[.='NEW'])[1]")
	private WebElement EE_status;
	
	@FindBy(xpath="((//th[.='Status'])[1]/../../../../../..//div[2]//span[.='DELIVERED'])[1]")
	private WebElement delevered;
	
	@FindBy(xpath="//button[@ng-click=\"openProcess()\"]")
	private WebElement Click_on_process_release_BTN;
	
	@FindBy(xpath="//button[.='RELEASE ONLY']")
	private WebElement Click_on_release_BTN;
	
	@FindBy(xpath="//button[text()='CLOSE']")
	private WebElement Close_BTN;
	
	@FindBy(xpath="//a[.=' LOGOUT']")
	private WebElement logoutLink;
	
	public backup(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickshow_all_status_Checkbox(){
		Show_All_Statuses.click();
	}

	public void entering_Order_Number(String E_order_number) {
		Order_Number_textbox.sendKeys(E_order_number);
	}
	public void search_button(){
		sleep(2);
		SEARCH_BTN.click();
	}
	String var_A_order_number = A_order_number.getText().toString();
	
	public void checking_order_number_status(String E_order_number) throws Exception{
		try {
			if (No_Data_status.isDisplayed()) {
				
				SEARCH_BTN.click();
						for(int i=0; i<=15;i++)
						{
							if (No_Data_status.isDisplayed()) 
							{
						SEARCH_BTN.click();
						Thread.sleep(200000, 100);
						System.out.println("Succesfully waited please dont close window i am going to retying ");
							}					
							else if(EE_status.isEnabled()) {
							System.out.println("after ddd");
						      break;
							}
							}
			}
				}
			
			catch (NoSuchElementException e){

											}
		}
	public void New_status(String E_order_number) throws InterruptedException {
			try {
		if(EE_status.isEnabled()) {
				String var_A_order_number = A_order_number.getText().toString();
				String var2_A_Status_new=EE_status.getText().toString();
				String var_EE_status = EE_status.getText().toString();
			
				Assert.assertEquals(var_A_order_number, E_order_number);
				Assert.assertEquals(var2_A_Status_new, var_EE_status);
				A_order_number.click();
				Click_on_process_release_BTN.click();
				System.out.println("after click on release button");
				Thread.sleep(4000);
				Click_on_release_BTN.click();
				sleep(5000);
//			
				
//				WebElement element1 = driver.findElement(By.xpath("//button[text()='CLOSE']"));
//				element1.click();
//				JavascriptExecutor jse = (JavascriptExecutor) driver;
//				jse.executeScript("arguments[0].click();", Close_BTN);
				
				Actions action=new Actions(driver);
				action.moveToElement(Close_BTN).click();
				
//				Close_BTN.click();
				sleep(4000);

				String var_A_Status=A_status.getText().toString();
				Reporter.log(var_A_Status,true);
				System.out.println("2st if");
							}
		}
			catch (NoSuchElementException e){
				//System.out.println(e);

		}
			
			}
					
	public void  other_status(String E_order_number)throws InterruptedException {
		 try{
			 if(delevered.isDisplayed()) {
				 
				 Assert.assertEquals(var_A_order_number, E_order_number);
				 A_order_number.click();
				 Thread.sleep(2000);
				Click_on_process_release_BTN.click();
				 Thread.sleep(2000);
				Actions action=new Actions(driver);
				action.moveToElement(Close_BTN).click();
				 Thread.sleep(2000);
				 
			 }
		
	}
		catch (NoSuchElementException e){

	}
		 finally {
			 String var2_A_Status=A_status.getText().toString();
			 Reporter.log(var2_A_Status,true);
			 System.out.println("finally working");
		 }															}
}
















//
//	public void clickLogout(){
//		sleep(2);
//		logoutLink.click();
//}
