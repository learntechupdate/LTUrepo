package InterviewQ;

import java.util.Scanner;

public class DecimalToBinary {

	public String toBinary(int n)
	{
		if(n==0)
		{
			return "0";
		}
		String binary="";
		while(n>0)
		{
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		
		return binary;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("enter the Number");
		Scanner scn=new Scanner(System.in);
		int number = scn.nextInt();
		
		DecimalToBinary dtb=new DecimalToBinary();
		String b = dtb.toBinary(number);
		System.out.println("the binary number of "+number+" is "+b);
		scn.close();
	}
}
