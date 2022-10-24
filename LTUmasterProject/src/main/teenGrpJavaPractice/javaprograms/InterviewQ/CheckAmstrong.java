package javaprograms.InterviewQ;

import java.util.Scanner;

public class CheckAmstrong 

{
  public static int amstrong(int n)
  {
	  int digcnt=n;
	  int temp=n;
	  int count=0;
	  int res=0;
	  while(digcnt>0)
	  {
		  digcnt=digcnt/10;
		  count++;
	  }
	  
	  while(n!=0)
	  {
		 int r=n%10;
		 res+=(int)Math.pow(r, count);
		 n=n/10;
		 
	  }
	  
	  if(res==temp) {System.out.println(temp+" is Amstrong number");}
	  else          {System.out.println(temp+" is Not a Amstrong number");}
	  
	  return res;
  }
  
  public static void main(String[] args) 
  {
	System.out.println("Enter the number to check Amstrong");
	Scanner scn=new Scanner(System.in);
	System.out.println("resultant no is "+CheckAmstrong.amstrong(scn.nextInt()));
	scn.close();
  }
}
