package javanotes;

public class Conditionalif {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the month in number");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		int month = scn.nextInt();
		//1-2->Spring, 3-5->Summer, 6-9 ->Rainy 10-12 -> winter
		if(month<=2) {
			System.out.println("Spring season");
		}
		else if(month<=5) {
			System.out.println("Summer");
		}
		else if(month<=9) {
			System.out.println("Rainy");
		}
		else if (month<=12) {
			System.out.println("winter");
		}
		else {
			System.out.println("invalid input enter the month less than 12");
		}
		scn.close();
	}

}
