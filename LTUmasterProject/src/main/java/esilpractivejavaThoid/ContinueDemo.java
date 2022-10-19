package esilpractivejavaThoid;



public class ContinueDemo {
	
	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <= n; i++) {
			
			if(i==2) {
				continue;//will skip the rest of statement without breaking loop / exe next iteration
			}
			System.out.print(i);
		}
		
		
		//continue; // cannot be used out side loop
		
	}

}
