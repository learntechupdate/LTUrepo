package javanotes;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
		
System.out.println("\"Welcome\"");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter UserName");
		String un = scn.next();
		System.out.println("Enter Password");
		String pwd = scn.next();
		
		int login = 0;
		
		//we cannot perform logical operation in switch statement 
		if (un.equalsIgnoreCase("admin") && pwd.equals("admin123")) { //string is object needs to be compared
			login=1;
			
		}
	
		//Example swtich(un.equalsIgnoreCase("admin") && pwd.equals("admin123")) is not valid
		switch (login) {
		
		case 1:
			System.out.println("Logged in successfully");
			break;

		default:
			System.err.println("Enter valid Username or password");
			break;
		}
		
		scn.close();
		
	}

}
