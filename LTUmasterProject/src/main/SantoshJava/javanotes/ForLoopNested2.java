package javanotes;

public class ForLoopNested2 {
	
	public static void starPattern(int noOfLines) {
		//for count of lines
		for (int i = 0; i < noOfLines; i++) {
			//for numbers of stars per line
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println("");	
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the lenght of pattern");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		int number = scn.nextInt();
		starPattern(number);
		scn.close();
	}

}
