package testNGlistener;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class testNGListeners extends TestListenerAdapter {

	
	
	public void onTestStart(ITestResult result) {
		System.out.println("testStart>>> " +result.getName());
	}
	
public  void onTestSuccess(ITestResult result) {
		System.out.println("testSuccess>>> " + result.getName());

	}
public  void onTestFailure(ITestResult result) {
	System.out.println("testFailure>>>"+ result.getName());

}
public void onTestFinish(ITestResult result) {
	System.out.println("testFailure>>>"+ result.getName());

}

}
