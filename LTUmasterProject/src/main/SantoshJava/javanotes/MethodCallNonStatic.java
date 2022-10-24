package javanotes;

public class MethodCallNonStatic {
	
	public void display(String name) {
		System.out.println("The Name you have entered is \""+name+"\"");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter name");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		String name=scn.next();
		scn.close();
		//create a object to call a Nonstatic method
		MethodCallNonStatic mc=new MethodCallNonStatic();
		mc.display(name);
	}

}
