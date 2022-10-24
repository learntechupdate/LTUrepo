package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

import Library.Utility;

public class TestRunner 

{


	
	//running testNG programatically
	public static void main(String[] args) 
	
	{
		String SuiteName="SmokeTestScenarios", SuiteName1="Suite";
		
		TestNG runner=new TestNG();
		
		List<String> list=new ArrayList<String>();
		
		list.add(Utility.project_path()+"./test-output/"+SuiteName+"/testng-failed.xml");
		list.add(Utility.project_path()+"./test-output/"+SuiteName1+"/testng-failed.xml");		
		runner.setTestSuites(list);
		
		runner.run();
	}
}
