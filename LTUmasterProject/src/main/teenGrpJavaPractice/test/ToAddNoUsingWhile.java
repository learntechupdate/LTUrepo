package test;

import java.util.Scanner;
public class ToAddNoUsingWhile {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=ip.nextInt();
		
		int sum=0;
		while (n!=0) {
			int rem;
			rem=n%10;
			sum+=rem;
			n=n/10;
			
		}
		System.out.println("sum of no="+sum);
		ip.close();

	}

}
