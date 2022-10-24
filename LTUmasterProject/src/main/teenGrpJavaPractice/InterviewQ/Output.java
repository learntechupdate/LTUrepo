package javainterview;

import java.util.Scanner;

/*
 (5,6,7)=5+6+7
 (5,6,5)=6
 (5,5,5)=0
 5
 */
public class Output {
	
	public static void main(String[] args) 
	{
		Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the values of x y & z respectively");
		int x = scn.nextInt(),y = scn.nextInt(),z = scn.nextInt();
		
		if(x==y && y==z)
		{
			System.out.println(x+"+"+y+"+"+z+"is 0");
		}
		else if(x!=y && y!=z && z!=x)
		{
			System.out.println(x+"+"+y+"+"+z+"="+(x+y+z));
		}
		else
		{
			System.out.print(x+"+"+y+"+"+z+" is");
		if(x==y){System.out.println(z);}
		else if(y==z){System.out.println(x);}
		else if(z==x){System.out.println(y);}
		
		}
		scn.close();
		
	}

}
