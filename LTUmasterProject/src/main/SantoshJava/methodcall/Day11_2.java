package methodcall;

import methodcallbothstatic.Run;

public class Day11_2 {
	
	public static void main(String[] args) {

		System.out.println("Main method starts");
		
		Demo r1= new Demo();
		r1.intrestCalculation(1000); // creating an object
		
		new Demo().intrestCalculation(2000); //Directly creating object of that mehtod and call the method
		
		Demo.display("Touheed");//static method
		
	}

}
