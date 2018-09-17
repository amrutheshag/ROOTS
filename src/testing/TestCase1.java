package testing;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test (groups={"smokeTest"},priority=1)
	
	public void sendingmail(){
	System.out.println("mail sent successfully");
	}
	
	@Test (groups={"smokeTest"},priority=2)	
	public void save_in_Draft(){
		System.out.println("saved in draft successfully");
		}

}
