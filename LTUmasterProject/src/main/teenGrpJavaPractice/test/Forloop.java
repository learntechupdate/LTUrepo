package test;

import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter upto which no should be printed");
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		
		System.out.println("Sequence of no exclding no divisible by 5");
		for (i=n;i>1;i--){
			
				if(i%5!=0){
				System.out.print(i+",");}
			
		}System.out.print("1.");}

	}


