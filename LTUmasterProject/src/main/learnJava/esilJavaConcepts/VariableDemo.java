package esilJavaConcepts;

public class VariableDemo {
	
	//write variable names with a letter, not "$" or "_".
	
	
	public static void main(String[] args) {
		
		int intvar= 5_00_000; // we can include underscore in values for separation
		
		System.out.println(intvar);
		
		
        int intVar=1/3;
		
		
		System.out.println("Deminal value rounded off : "+intVar);
		
		float floatvar=1/3f; // works for 1f/2 , 1f/2f 
		
		System.out.println("float value has 8 decimal points : "+ floatvar);
		
		double doubleVar= 1/3d;
		
		System.out.println("double value has 16 decimal points : "+doubleVar);
		
		double intVar2 = Math.pow(2, 10);// power off
		
		
		System.out.println("intVar2 : "+intVar2);
		
	}

}
