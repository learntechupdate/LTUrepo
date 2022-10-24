package encapsulation;

public class Accountuser {

		public static void main(String[] args) {
		Account a1=new Account(200, "", 100);
		a1.setName("thoid");
		a1.getBal();
		
		System.out.println(a1.getBal());

	}

}
