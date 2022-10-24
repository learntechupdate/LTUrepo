package javanotes;


public class Inputfromkeyboard 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		int inputInteger=scn.nextInt();
		
		System.out.println("Enter a data");
		String inputSring = scn.next();
		
		System.out.println("The Entered value is "+inputInteger);
		System.err.println("Entered data is "+inputSring); // err displays error in console
		scn.close();
	}
}
