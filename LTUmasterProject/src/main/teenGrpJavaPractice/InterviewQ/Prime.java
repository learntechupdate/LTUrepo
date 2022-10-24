package InterviewQ;

import java.util.Scanner;

public class Prime 
{
	//A number only divisible by itself and 1
	//n=9 divide from 2 to 8 : by divisible by 3 : their fore 9 is Not prime
	//n=7 divide form 2 to 6 : No divisible by any number : therefore 7 is prime
  public void checkPrime(int n)
  {	  int reminderCount = 0;
	  for (int i = 2; i < n; i++) 
	  {
		if(n%i==0)
		{
			reminderCount++;
		}		
	  }
	  
	  if(reminderCount>0)
	  {
		  System.out.println(" Not a Prime ");
	  }
	  else
	  {
		  System.out.println(" Is a Prime number");
	  }	  
  }
  
  public static void main(String[] args) 
  {
	  System.out.println("enter the Number");
		Scanner scn=new Scanner(System.in);
		int number = scn.nextInt();
		
		Prime cp=new Prime();
		System.out.print(number);
		cp.checkPrime(number);
		scn.close();
  }
}
