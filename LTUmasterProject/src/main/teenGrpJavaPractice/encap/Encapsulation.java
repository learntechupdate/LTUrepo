package encap;

public class Encapsulation {

	public static void main(String[] args)
	{
		Account a1=new Account(101,"java",500);
		System.out.println(a1.getAccno());	
		//a1.setAccno(102);
		Account a2=new Account(102,"kumar",500);
		a2.setName("");
		System.out.println(a2.getAccno());
		System.out.println(a2.getName());	
	
	}

}
