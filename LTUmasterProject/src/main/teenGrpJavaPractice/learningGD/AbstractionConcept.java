package learningGD;

import java.util.Scanner;

public class AbstractionConcept {

	public static void main(String[] args) {
		//CalciImplementation ci= new CalciImplementation();
		CalciEnhancement ci=new CalciEnhancement();
		System.out.println("Enter the two values");
		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println("Enter 1 for Addition and 2 for Multiplication");
		int m=scn.nextInt();
		if(m==1)
		{
			ci.add(a, b);
		}
		else if (m==2) {
			ci.multiply(a, b);
		} 
		else {
			System.out.println("Invalid input entered");
		}	
		scn.close();
		
		
		

	}

}
