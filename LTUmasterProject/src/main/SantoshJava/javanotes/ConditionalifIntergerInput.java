package javanotes;

public class ConditionalifIntergerInput {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter UserName");
		int un = scn.nextInt();
		System.out.println("Enter Password");
		int pwd = scn.nextInt();
		
		if (un==456 && pwd==123) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Enter valid password");
		}
		scn.close();
	}

}
