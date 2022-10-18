package testconcept.grid;

import org.testng.annotations.Test;

import libraryGeneric.Excel;
import pageobject.opl.LoginPage;


public class login extends BaseTest{
	
	@Test
	public  void oplLogin()  
	{
		
		
		LoginPage lp=new LoginPage(driver);

		//reading data from excel for login page
		String a[]=new String[2];
		{
			for(int i=0;i<a.length;i++)
			a[i]=Excel.readData("./testdata/testdata.xlsx", "login", 1, i);
		}
		
		String userEmail=a[0];
		String password=a[1];
		
		lp.loginViaOplCredentials(userEmail, password);
		
		
	}
	
			
	}	
