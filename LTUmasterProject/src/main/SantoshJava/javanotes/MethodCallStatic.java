package javanotes;

public class MethodCallStatic {
	
	public static void add(int value1, int value2) {
		int sumof2 = value1+value2;
		System.out.println("Sum of Two is :"+sumof2);
	}
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		MethodCallStatic.add(a, b);//add(a,b)  - for method with in same class is not required
	}

}
