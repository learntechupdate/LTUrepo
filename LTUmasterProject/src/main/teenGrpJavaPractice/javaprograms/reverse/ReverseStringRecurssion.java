package javaprograms.reverse;

import java.util.Scanner;

public class ReverseStringRecurssion 
{
   public static String reverseString(String str)
   {
	   String reverse = "";
	   if(str.length()==1)
	   {
		   return str;
	   }
	   else{   
	   reverse+=str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	   return reverse;
	   }
   }
   
	public static void main(String[] args) 
	{
		System.out.println("enter the String to reverse");
		Scanner scn=new Scanner(System.in);
		String s1 = scn.next();
		System.out.println(ReverseStringRecurssion.reverseString(s1));
		scn.close();
		
	}
}
