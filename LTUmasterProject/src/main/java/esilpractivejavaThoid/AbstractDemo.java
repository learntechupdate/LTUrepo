package esilpractivejavaThoid;

public abstract class AbstractDemo {
	
	private int value;
	
	//abstract class
	public abstract void add (int a , int b);
	
	
	public void show(int value) {		
		this.value=value;
		System.out.println("your value is : " + value);
	}
	

}
