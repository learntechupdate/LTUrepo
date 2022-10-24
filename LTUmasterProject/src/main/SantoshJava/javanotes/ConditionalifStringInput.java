package javanotes;

public class ConditionalifStringInput {
	
	public static void main(String[] args) {
		
		
		System.out.println("\"Welcome\"");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter UserName");
		String un = scn.next();
		System.out.println("Enter Password");
		String pwd = scn.next();
		
		if (un.equalsIgnoreCase("admin") && pwd.equals("admin123")) { //string is object needs to be compared
			System.out.println("Logged in successfully");
		}
		else {
			System.err.println("Enter valid Username or password");
		}
		scn.close();
	}

}
