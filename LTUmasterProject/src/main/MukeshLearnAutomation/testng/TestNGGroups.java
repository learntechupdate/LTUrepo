package testng;

import org.testng.annotations.Test;

public class TestNGGroups 


{

	@Test(groups={"smoke","Regression"})
	public void login()
	{
		System.out.println("Login done");
		System.out.println("smoketest done");
	}
	
	@Test(groups={"Regression"})
	public void register()
	{
		System.out.println("Registration done");
	}
}
