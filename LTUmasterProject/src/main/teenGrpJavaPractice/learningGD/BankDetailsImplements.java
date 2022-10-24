package learningGD;


public abstract class BankDetailsImplements implements BankDetails
{
		public double getLoanamout() {
		return loanamout;
	}

	public void setLoanamout(double loanamout) {
		this.loanamout = loanamout;
	}

		String name;
		int AccountNo;
		double bal;
		private double loanamout;

		BankDetailsImplements(String name, int accountNo, double bal,double l) {
			super();
			this.name = name;
			AccountNo = accountNo;
			this.bal = bal;
			loanamout=l;
				}

		public void accountDetails(Object object)
		{
			BankDetailsImplements ob=(BankDetailsImplements)object;
			System.out.println("welcome to @@@@@ SBI  @@@@@");
			System.out.println("Name:"+ob.name);
			System.out.println("Account Number is:"+ob.AccountNo);
			System.out.println("Balance is:"+ob.bal);		
			
		}

		public void loanDetails(Object object) {
			BankDetailsImplements ob=(BankDetailsImplements)object;
			System.out.println("welcome to @@@@@ SBI Loans @@@@@");
			System.out.println("Name:"+ob.name);	
			System.out.println("Loan Amount is:"+ob.loanamout);
		}

		
		
}

