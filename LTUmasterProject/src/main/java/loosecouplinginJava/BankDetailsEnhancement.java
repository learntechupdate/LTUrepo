package loosecouplinginJava;

import java.io.InputStream;
import java.util.Scanner;


public class BankDetailsEnhancement extends BankDetailsImplements
{
	BankDetailsEnhancement(String name, int accountNo, double bal, double l) 
	{
		super(name, accountNo, bal, l);
		
	}

	public void accountDetails(Object obj)
	{
		super.accountDetails(obj);
		System.out.println("This is enhanced class");
	}
@Override
public void loanDetails(Object object) {
	// TODO Auto-generated method stub
	super.loanDetails(object);
	
	
}

//@Override
public void repaymentLoan(double l) {
	/*Scanner scn= new Scanner(System.in);
		System.out.println("Enter 1 for to change loan amt");
/		int c=scn.nextInt();
/		
		if(c==1)
		{
			System.out.println("Enter new loan amt");
			
		double a=scn.nextDouble();
		setLoanamout(a);
		}
		else
		{
			System.out.println("Loan details not changed");
			
		}*/
	setLoanamout(l);	
}


}
