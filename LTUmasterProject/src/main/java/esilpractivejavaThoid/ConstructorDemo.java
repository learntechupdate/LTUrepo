package esilpractivejavaThoid;


class A
{
	
	int var1;
	int var2;
	int result=var1+var2;
	
	public A(){
		var1=10;
	}
	
	//parameterized constructor / overloading consturctor
	public A(double parVar) {
		
		var2 = (int)parVar;
	}
	
	
	
	
}


public class ConstructorDemo 
{

	public static void main(String[] args) {
		
		A obj=new A();
		A obj2=new A(18.288);
		
		System.out.println(obj.var1);
		System.out.println(obj2.var2);
		System.out.println(obj2.result);
	}
	
}

