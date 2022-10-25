package javaconcept.oops;

/*
 * 1h:51m
 */

class Casio{
	
	int num1, num2;
	String operation;
	//--constructor overloading 
	public Casio() {
		num1=0;
		num2=0;
		operation="nothing";
	}
	
	public Casio(int i) {
	
		num1=i;
		num2=0;
		operation="nothing";
	}
	public Casio(int i,int j) {
		
		num1=i;
		num2=j;
		operation="nothing";
	}
    public Casio(int i,int j, String o) {
		
		num1=i;
		num2=j;
		operation=o;
	}
	//------
	
	
	//-------method overloading
	public void add(int i, int j) {
		System.out.println(i+j);
	}
//	public int add(int i, int j)   // diff return type with same method name X not allowed
//	{ 
//		
//		return i+j;
//	}

	public void add(int i, int j, int k) {
		
		System.out.println(i+j+k);
		
	}
    public void add(double d, double e) {
	
    	System.out.println(d+e);
    //-------
	
}
		
	
}
public class J10OverloadingMethodAndConstutor {

	public static void main(String[] args) {
		
		Casio m1=new Casio();
		m1.add(1, 2);
		m1.add(1, 2,3);
		m1.add(1.4, 2.5);
		
		
		Casio c1=new Casio();
		Casio c2=new Casio(2);
		Casio c3=new Casio(1,2);
		Casio c4=new Casio(1,2,"sergeric");
				
	}
}
