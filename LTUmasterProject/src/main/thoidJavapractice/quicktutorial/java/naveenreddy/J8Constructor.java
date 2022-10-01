package quicktutorial.java.naveenreddy;

/*
 * Member method
 * same name as class name
 * it will never return any type
 * it will used to allocate memory
 * will be called automatically
 */

/*
 * Constructor overloading
 */

/*
 * public static void main(String args[])
 * parameter- can be anything we are using string as it accept all values : String[] , 
 * args[] we don't not know size
 * 
 * 1h:30m
 */
class Calc{
	
	int num1;
	
	


	public Calc() {
		System.out.println("Default Constructor ");
		num1= 555;
	}
	
	public Calc(int var1) {
		num1=var1;
		
		System.out.println(num1);
	}
	
	public Calc(double var2) {
		
		num1=(int) var2;
		System.out.println(num1);
	}
	
}

public class J8Constructor {
	
	public static void main(String[] args) {
		
		Calc c1= new Calc();
		Calc c2= new Calc(5.5);
		Calc c3= new Calc(50);
		
		
	}

	
	
}
