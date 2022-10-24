package library;

import org.testng.Reporter;

public class EcomPriceComp {
	
	
	//For two websites comparing the low price
		public static void lowpriceCompare(String Ecommerce1Name,int Ecommerce1Prize,String Ecommerce2Name, int Ecommerce2Prize) {
		if (Ecommerce1Prize < Ecommerce2Prize) {
			
			Reporter.log((Ecommerce1Name+" price is lesser : Rs " + Ecommerce1Prize),true);
			 
		} else {
			Reporter.log((Ecommerce2Name+" price is lesser : Rs " + Ecommerce2Prize),true);
		}
		}

}
