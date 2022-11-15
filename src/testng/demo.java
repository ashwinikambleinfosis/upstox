package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	
	@Test(priority=2)
public void tc1() {
		Reporter.log("running tc1",true);
	}
	@Test(priority=1)
	public void tc2() {
		Reporter.log("running tc2",true);
		
		
	}
}
