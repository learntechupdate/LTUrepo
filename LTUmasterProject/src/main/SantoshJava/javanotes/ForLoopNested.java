package javanotes;

public class ForLoopNested {
	
	public static void StarPatternDownwordTriangle(int n) {
		
              
		    for (int i = n; i>=0; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
       System.out.println("Enter number");
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		int number = scn.nextInt();
		System.out.println("Below is the pattern");
		ForLoopNested.StarPatternDownwordTriangle(number);
		
	}

}
