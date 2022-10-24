package javanotes;

public class ClassLoading {
	
	public static void main(String[] args) {
		Account a1=new Account();
		a1.accNO=101;
		a1.name="varma";
		a1.bal=500;
		a1.bName="Yes";
		
		Account a2=new Account();
		a2.accNO=107;
		a2.name="Gowda";
		a2.bal=505;
		a2.bName="SBI";
		System.out.println(Account.bName);
		
	}

}

class Account{
	int accNO;
	String name;
	int bal;
	static String bName;
}
	
