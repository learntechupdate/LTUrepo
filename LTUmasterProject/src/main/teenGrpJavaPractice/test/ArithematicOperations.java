package test;

import java.util.Scanner;
public class ArithematicOperations {

	public static void main(String[] args) {
		System.out.println("Enter two interger no's");
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		System.out.println("1: for additon 2: for sub  3: for div 4: for rem  5: for mul");
		int n=ip.nextInt();
		switch(n){
		case 1: System.out.println("a+b="+(a+b));break;
		case 2: System.out.println("a-b="+(a-b));break;
		case 3: System.out.println("a%b="+(a%b));break;
		case 4: System.out.println("a/b="+(a/b));break;
		case 5: System.out.println("a*b="+(a*b));break;
		default : System.out.println("Invalid input");break;
		}

	}

}
