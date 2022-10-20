package javaconcepts;

public class SelectionDemo4 {
	
	/*
	 * if
	 * Switch - int, char , string(can be used as operator above 1.7 jdk) , double cannot be used , 
	 * ternary -> condition?expr1:expr2
	 */
	
	//If state
	public static void main(String[] args) {
		int input=5;
		
		if(true)
			System.out.println("hi");
		if(false)
			System.out.println("Bed");
		else
			System.out.println("ges");
		
		
		//if more than two statement use {}
		if(input==5) {
			System.out.println("Hey");
		    System.out.println("Lenov");
		}
		    else 
		    	System.out.println("tnas");
	
		
		//
		
		 
			if(input%2==0)
			System.out.println("Even");			    
			if(input%2!=0) 
				System.out.println("odd");
		    
		
			
		if(input==0)
			System.out.println("Zero is not even or odd");
		else 
			if(input%2==0)
			System.out.println("Even2");				
	        else
			System.out.println("odd2");
		
		
		//ternary operator 
		
		if(input>4)
			System.out.println(5);
		else
			System.out.println(8);
		
		int output=input>4?50:80;
		System.out.println(output);
		
		
		//Switch 
		
		switch (input) {
		case 5:
			System.out.println(500);			
			break;

		default: 
			System.out.println("other");
			break;
		}
		
		//string in switch statement
		String input2="lenovo";
		switch (input2) {
		case "lenovo":
			System.out.println(5000);			
			break;

		default: 
			System.out.println("other");
			break;
		}
		
		
		
	}
	

}
