package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo 
{
	
	@AfterMethod
	public void closeApp(ITestResult testResult) {
		String name = testResult.getName();
		int status = testResult.getStatus();
		Reporter.log(name+" is "+status,true);
		
	}
	
	@Test
	public void testA() {
		Reporter.log("TestA",true);

	}
	
	@Test
	public void testB() {
		Reporter.log("TestB",true);
		Assert.fail();
	}
	
}
