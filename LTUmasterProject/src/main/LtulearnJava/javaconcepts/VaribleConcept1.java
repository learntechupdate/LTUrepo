package javaconcepts;

public class VaribleConcept1 {
	
	public static void main(String[] args) {
		
		//$, _ can be used , should not start with number
		
		
		int num=50_00_00_000;//underscore'_' can we used between number after jdk 1.7
		
		System.out.println(num);
		
		double decimal = 50_00.76_65;
		System.out.println(decimal);
		
		
		          
		/*
		 byte b; short s;
		          char c;   int i ; long l ; float f; double d;
		 */
		long l =500000000000l;// 8bytes
		int i=5; //4 bytes -> 32 bits
		short s=5;//2 bytes -> 16 bits-> -32768 to 32767
		byte b=5; //1 byte ->8 bits -> -128 to 127
		float f=5.5f;
		double d=5.5;
		
		char c='A';
		c=66; //American Standard code for information interchage ( ADCII)
		
		System.out.println(c);

		
		double d1=5; //implicit convertion
		int k= (int)5.6;
		System.out.println(k);
			
		
		
	}

}
