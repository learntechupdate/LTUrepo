package InterviewQ;

import java.util.Scanner;

public class ReverseString 
{
   public static String reverseString(String s1)
   {
	   if(s1.length()==1)
	   {
		   return s1;
	   }
		   
	   String s2 = "";
	int l=s1.length()-1;
	for (int i = l; i >=0; i--) 
	{
		char c=s1.charAt(i);
		 s2=s2+c;
	}
	return s2;
	   
   }
	public static void main(String[] args) 
	{
		System.out.println("enter the String to reverse");
		Scanner scn=new Scanner(System.in);
		String s1 = scn.next();
		System.out.println(ReverseString.reverseString(s1));
		scn.close();
		
	}
}
