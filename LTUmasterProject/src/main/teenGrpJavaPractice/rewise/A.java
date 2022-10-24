package rewise;

public class A

{
	 A(){
		System.out.println("class A() constructor");
	}//dconstuctor
	 
	 void run()
	 {
		 System.out.println("Non Static Method Run()");
	 }
	 static void test()
	{
		 System.out.println("Static Method Test()");
	 }
	 

	static 
	{
		
	System.out.println("Static block");
	}

	{
		System.out.println("Non static block");
	}
	
}

