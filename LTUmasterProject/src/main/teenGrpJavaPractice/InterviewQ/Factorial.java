package InterviewQ;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		
		int i=1;
		
		
		if(n==0)
		{
			return 1;
		}
		while(n>0)
		{
			i=i*n;
			n--;
		
		}
		return i;	
		}

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("Factorical of "+n+"! is "+fact(n));
		scn.close();
	}
}


