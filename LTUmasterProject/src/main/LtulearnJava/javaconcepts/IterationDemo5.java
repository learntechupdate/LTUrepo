package javaconcepts;

public class IterationDemo5 {
	
	/*purpose :  to eliminate code redundancy
	 * while : unware of number of iteration ex. input from user
	 * do while : execute statement at least once 
	 * for  : when we know start and end point
	 * for each  : useful in array and collections 
	 * Nested loops : 
	 */
	
	/*
	 // Assignment
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 //Use ASCII value
	 * A
	 * AB
	 * ABC
	 * 
	 * $$$$
	 * $  $
	 * $  $
	 * $$$$
	 * 
	 *
	 */
	public static void main(String[] args) {
		
		//while 
		int i=1;		
		while(i<5) {
			
			System.out.println("Hi");
			++i;			
		}
		
		//do while
		int j=5;
		do {
			System.out.println("do");
			j++;
		}
		while(j<2);
		
		
		//for 
		
		for(int k=0; k<5; k++) {
			
			System.out.println(k);
		}
		
		
		//for each
		int[] k= {10,20,30,40};
		for(int e : k) {
		
			System.out.println(e);
		}
		
		
		//nested loops		
		for (int k2 = 0; k2 < 5; k2++) {
		
			for (int l = 0; l < k2; l++) {
				System.out.print(l);
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
	}

}
