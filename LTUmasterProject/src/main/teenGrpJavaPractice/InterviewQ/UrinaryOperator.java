package javapractice;

import java.util.Scanner;

public class UrinaryOperator 
{

	public static void main(String[] args) 
	{
		int x=10,y=5;
		
		y=++x-x--;
		x=--y + ++y + x++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("x is "+x+" y is "+y);
		System.out.println("10"+20+30);
		System.out.println("10"+(20+30));
		
		Scanner scn= new java.util.Scanner(System.in);
		
	}
}
