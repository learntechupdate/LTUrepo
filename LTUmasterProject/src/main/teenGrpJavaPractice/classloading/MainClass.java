package classloading;

public class MainClass 
{
	 public MainClass() {
		System.out.println("TODO Auto-generated constructor stub");
	}
	 public static void main(String[] args) 
	 
	 {
	System.out.println("Main class loaded");	
	 A a1=new A();
	 System.out.println();
	 A b1=new A();
	 
	 a1.Method();
	 b1.Method();
	 A.staticMethod();
	 System.out.println(A.staticMethod);
	 System.out.println("Main class ended");
	 }
}


