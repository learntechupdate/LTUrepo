package javaconcepts;

public class OperatorsDemo3 {

	
	/*
	 Arithmetic + - * / %
	 Bitwise << >>
	 Relational
	 Logical
	 */
	
	public static void main(String[] args) {
		
		int num1=6, num2=4;
		
		System.out.println((double)num1/num2); //if not converted to double decimal value is not stored
		System.out.println(num1%num2); // % reminder 
		
		
		//shorhand
		int n=4, m=5;		
		n=n+m;		
		System.out.println(n);
		
        int n2=4, m2=5;		
		n2+=m2;		
		System.out.println(n2);
		
		//increment
		int n3=10, m3=5;	
		
		m3=n3++; //post increment
		
		System.out.println(m3);
		System.out.println(n3);
		
		
		
	}
}
