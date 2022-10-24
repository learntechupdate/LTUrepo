package InterviewQ;

import java.util.Scanner;

public class CheckPrime 
{
  public void checkPrime(int n)
  {	  int count = 0;
	  for (int i = 2; i < n; i++) 
	  {
		if(n%2==0)
		{
			count++;
		}		
	  }
	  
	  if(count>0)
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
		
		CheckPrime cp=new CheckPrime();
		System.out.print(number);
		cp.checkPrime(number);
		scn.close();
  }
}
