package javaconcepts;

	
	/*
	 * Blueprint : Class - structure
	 * object Ex. Building  
	 */

class Cal{
	
	int num1, num2, result;
	
	public void perform() {
		result= num1+num2;
	}
	
}

public class ClassNObject7{
	
	public static void main(String[] args) {
		
		Cal ref=new Cal();
		
		ref.num1=8;
		ref.num2=10;
		ref.perform();
		System.out.println(ref.result);		
		
	}
}
