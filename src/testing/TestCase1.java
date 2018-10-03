package testing;

import generic.Retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test (retryAnalyzer=Retry.class,groups={"smokeTest"},priority=1)
	
	public void sendingmail(){
	System.out.println("mail sent successfully");
	Assert.fail();
	}
	
	@Test (groups={"smokeTest"},priority=2)	
	public void save_in_Draft(){
		System.out.println("saved in draft successfully");
		}

}
