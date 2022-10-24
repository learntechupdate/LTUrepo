package test;

import java.util.Scanner;

public class IfConditonStatement {

	public static void main(String[] args) {
		System.out.println("enter age");
		 Scanner ip=new Scanner(System.in);
		 int age=ip.nextInt();
		 if(age>21 && age<50){
			 System.out.println("Eligible for marriage");
		 }
		 else if(age<21){
				 System.out.println("do studies");
			 }
                 else{
				 System.out.println("Retirement");
			 }
		
		 }
		 

	}


