package com.roots.page;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import generic.BasePage;
import generic.Excel;

public class Checkout_Page extends BasePage {
	String un=Excel.getCellValue("./data/input.xlsx","credentials",2,2);
	
	
	@FindBy(xpath="//a[.='CONTINUE TO CHECKOUT']")
	private WebElement Continue_to_Checkout;
	
	@FindBy(xpath="//span[.='CHECKOUT AS A GUEST']")
	private WebElement Checkout_as_Guest;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_email")
	private WebElement Shipping_Email;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	private WebElement First_Name;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_lastName")
	private WebElement Last_Name;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_address1")
	private WebElement Address1;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_zipcode")
	private WebElement Zipcode;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_city")
	private WebElement City;
			
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_phone")
	private WebElement Phone_Number;	
			
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_states_state")
	private WebElement Provinence;
	
	@FindBy(xpath="	//button[.='CONTINUE TO PAYMENT' and @name='dwfrm_singleshipping_shippingAddress_applyShippingAddress']")
	private WebElement Continue_payment;
		
	@FindBy(xpath="	//button[.=' Continue with this address']")
	private WebElement Continue_with_address;
	
	//@FindBy(xpath="//h3[@class='creditCardHeading creditCardHeadingSpace']")
	@FindBy(xpath="//span[@class='creditCardImages']")
	private WebElement Credit_card_RD_BTN;
	
	@FindBy(id="dwfrm_billing_paymentMethods_creditCard_owner")
	private WebElement CardHolderName;
	
	@FindBy(id="dwfrm_billing_paymentMethods_creditCard_number")
	private WebElement CardNumber;
	
	@FindBy(id="dwfrm_billing_paymentMethods_creditCard_month")
	private WebElement CardMonth;
	
	
	@FindBy(id="dwfrm_billing_paymentMethods_creditCard_year")
	private WebElement CardYear;
	
	@FindBy(id="dwfrm_billing_paymentMethods_creditCard_cvn")
	private WebElement SecurityCode;
	
	@FindBy(xpath="//span[contains(text(),' The following fields need your attention:')]")
	private WebElement Err_Msg;
	
	@FindBy(xpath="//button[@class='expresscheckout expresscheckoutSpace paymentButton']")
	private WebElement PayPalBTN;
	
	@FindBy(id="email")
	private WebElement PayPal_Un_TB;
	
	@FindBy(id="password")
	private WebElement PayPal_PW_TB;
	
	@FindBy(id="btnLogin")
	private WebElement PayPal_LogIn_BTN;
	
	@FindBy(xpath="//label[.='Make this my preferred shipping address']")
	private WebElement PayPal_Make_This_Address_CheckBox;
	
	@FindBy(id="confirmButtonTop")
	private WebElement PayPal_Continue_BTN;
	
	
	
	@FindBy(xpath="//button[.='CONTINUE TO REVIEW']")
	private WebElement ContinuetoReviewBTN;
	
	@FindBy(xpath="//a[@class='cmn-button place-order-button']")
	private WebElement PlaceorderBTN;
	
	@FindBy(xpath="//span[contains(text(),'PLACE ORDER NOW ')]")
	private WebElement PlaceorderBTN2;
	//span[contains(text(),'PLACE ORDER NOW ')]
	
	@FindBy(xpath="(//div[.='x'])[2]")
	private WebElement OrderconfirmationPopupClose;
	
	@FindBy(xpath="(//span[@class='value'])[2]")
	private WebElement Ordernumber;
	
	public Checkout_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	//String E_Product_desc=Product_Desc.getText().toString();
	public void CartpageTo_Til_OrderPlace(){
		try{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(6, TimeUnit.MINUTES)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(Continue_to_Checkout));
		
		Continue_to_Checkout.click();
		wait.until(ExpectedConditions.visibilityOf(Checkout_as_Guest));
		Checkout_as_Guest.click();
		wait.until(ExpectedConditions.visibilityOf(Shipping_Email));
		Shipping_Email.sendKeys(un);
		First_Name.sendKeys("Amruthesh");
		Last_Name.sendKeys("A G");
		Address1.sendKeys("Banjarahills");
		Zipcode.sendKeys("a1a1a1");
		City.sendKeys("Alabama");
		Phone_Number.sendKeys("313-213-2131");
		Select s1= new Select(Provinence);
		s1.selectByIndex(1);
		wait.until(ExpectedConditions.elementToBeClickable(Continue_payment));
		Continue_payment.click();
		wait.until(ExpectedConditions.elementToBeClickable(Continue_with_address));
		Continue_with_address.click();
		WebDriverWait wait1=new WebDriverWait(driver,20);
		
		wait1.until(ExpectedConditions.elementToBeClickable(Credit_card_RD_BTN));
		Credit_card_RD_BTN.click();
		CardHolderName.sendKeys("Ramesh");
		CardNumber.sendKeys("4111111111111111");
		
		Select s2 = new Select(CardMonth);
		s2.selectByIndex(2);
		sleep(2);
		Select s3 = new Select(CardYear);
		s3.selectByIndex(8);
		SecurityCode.sendKeys("123");
		sleep(2);

		wait1.until(ExpectedConditions.elementToBeClickable(ContinuetoReviewBTN));
		ContinuetoReviewBTN.click();
		sleep(2);
	
//		wait1.until(ExpectedConditions.elementToBeClickable(PlaceorderBTN));
//		PlaceorderBTN.click();
//		sleep(2);
		
		
//		wait1.until(ExpectedConditions.elementToBeClickable(OrderconfirmationPopupClose));
//		
//		OrderconfirmationPopupClose.click();
//		sleep(2);

		String E_order=Ordernumber.getText().toString();
		
		Reporter.log(E_order,true);
		}
		
			
		catch (Exception e) {
		}
		
		}
}
		
//span[.='Women']