
package learningGD;
import java.util.*;

public class InterfaceConcepts {

	/**
	 * @param object
	 */
	public static void loanRepaycal(BankDetails object)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter 1 for to change loan amt");
		int c=scn.nextInt();

		if(c==1)
		{
			System.out.println("Enter new loan amt");

			double a=scn.nextDouble();
			object.repaymentLoan(a);


		}
		else
		{
			System.out.println("Loan details not changed");

		}
	}
	public static void main(String[] args) {

		BankDetails bd1=HelperBank.getObject("Jana", 1012, 10000, 2000);
		BankDetails bd2=HelperBank.getObject("Riyaz", 1014, 100000, 3000);
		BankDetails bd3=HelperBank.getObject("Thoid", 1017, 11000, 3300);
		//@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter user name & password");
		System.out.println("");
		String un=scn.nextLine();
		String pwd=scn.nextLine();
		String a="admin";
		String b="admin123";

		if (un.equals(a) && pwd.equals(b) )

		{
			for(;;)
			{System.out.println("Enter 1 for Account Details and 2 for Loan Details,press 0  to logout");
			int value=scn.nextInt();

			if(value==1)
			{
				System.out.println("enter accno");
				int accno=scn.nextInt();
				switch(accno){
				case 1012:bd1.accountDetails(bd1);
				break;
				case 1014:bd2.accountDetails(bd2);
				break;
				case 1017:bd3.accountDetails(bd3);
				break;
				default:System.out.println("Account details not avalibale");
				}}
			else if (value==2) 
			{

				System.out.println("enter accno");
				int accno=scn.nextInt();
				switch(accno){
				case 1012:bd1.accountDetails(bd1);
				bd1.loanDetails(bd1);
				loanRepaycal(bd1);
				//bd1.repaymentLoan();
				break;

				case 1014:bd2.accountDetails(bd2);
				bd2.loanDetails(bd2);
				//bd2.repaymentLoan();
				loanRepaycal(bd2);
				break;
				case 1017:bd3.accountDetails(bd3);
				bd3.loanDetails(bd3);
				loanRepaycal(bd3);
				//bd3.repaymentLoan();
				break;

				default:System.out.println("Account details not avalibale");
				}}
			else if(value==0)
			{
				System.out.println("Successfully Logged Out");
				break;
			}
			else 
			{
				System.out.println("Invalid input");
			}
			}	}



		else {	
			System.out.println("Invalid user or password");		
		}


	}
}
//scn.close();




//class LoanRepay extends InterfaceConcepts
//{

//}

