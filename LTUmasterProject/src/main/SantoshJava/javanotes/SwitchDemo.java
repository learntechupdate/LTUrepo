package javanotes;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
        System.out.println("Enter the month in number");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		int month = scn.nextInt();
		//1-2->Spring, 3-5->Summer, 6-9 ->Rainy 10-12 -> winter
		
		switch (month) {
		case 1: 
		case 2:	
			System.out.println("Spring");
			break;
		case 3: 
		case 4:	
		case 5:
			System.out.println("Summer");
			break;
		case 6: 
		case 7:	
		case 8:
		case 9:
			System.out.println("Rainy");
			break;
		case 10: 
		case 11:
		case 12:
			System.out.println("Winter");
			break; // If break is not their the next case or statements will also execute 
		default:
			System.err.println("Enter a valid month in number");
			break;
			
		}
		
	}

}
