package esiljavapractiveThoid;

public class WhileDemo {
	
	public static void main(String[] args) {
		
		
		int n=6;
		int fact=1;
		
		int i=1;
		while (i<=n) {
			
			fact=fact*i;			
			i++;
		}
		
		System.out.println(fact);
		
}
	
}
