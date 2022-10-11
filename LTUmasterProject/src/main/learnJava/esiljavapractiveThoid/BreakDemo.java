package esiljavapractiveThoid;

public class BreakDemo {
	
	public static void main(String[] args) {
		
		int n=10;
		for (int i = 1; i <= n; i++) {
			
			if (i==4) {
				break; // will break the for loop
			}
			
			System.out.print(i+"\t");
		}
		
		//break; // cannot be used outside loop or swtich
	}

}
