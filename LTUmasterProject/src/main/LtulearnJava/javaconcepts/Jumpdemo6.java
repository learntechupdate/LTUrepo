package javaconcepts;

public class Jumpdemo6 {
	
	/*
	 * break : break the loop statement 
	 * Continue  : skip current iteration  of loop
	 */
	
	public static void main(String[] args) {
		
		
		//while(1) { }		 not allowed
		
		for (int i = 0; i < 10; i++) {
			
			if (i==5) {
				continue;
			}
			System.out.print(i);			
			System.out.println("Hey");
			
			if(i==8) {
				System.out.println("bye");
				break;
			}
			
		}
		
	}

}
