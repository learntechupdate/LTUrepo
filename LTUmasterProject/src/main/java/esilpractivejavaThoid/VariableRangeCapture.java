package esilpractivejavaThoid;

public class VariableRangeCapture {
	
	public static void main(String[] args) {
		
		char charVar = 'c' ;  // single char
		byte byteVar = 127;	 //  3 digits :1byte max 127	
		short shortVar = 32767; //  5 digits 
		int intVar = 2147483647; // 10digits 
		long longVar = 9223372036854775807l; // 19digits 
		float floatVar = 333333333333333333333333333333333333333.3333333f;// 39 digits numer decimal more
	    double doubleVar = 33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333.333d ;
		//double 308numerc decimal more 
	    boolean booleanVar = true; 
		
	    
	    
		
		
		System.out.println(charVar+"\n"+"\n"+byteVar+"\n"+"\n"+shortVar+"\n"+"\n"+intVar
				+"\n"+"\n"+longVar+"\n"+"\n"+floatVar+"\n"+"\n"+doubleVar+"\n"+"\n"+booleanVar);
		
				
		
		
		
		
	
	}
}
