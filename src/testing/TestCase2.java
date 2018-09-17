package testing;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

	public class TestCase2 {
		@Test(groups={"functionalTest","Regration"},priority=0)	
		public void loginTest(){
			Assert.assertEquals(1, 1);
			System.out.println("Logged in successfully");
		
			}

		@Test (groups={"functionalTest"},priority=3)
		public void lagout(){
			System.out.println("lagout successfully");
		}
		
	@Test()
	public void skip() {
		
	
	}
	}