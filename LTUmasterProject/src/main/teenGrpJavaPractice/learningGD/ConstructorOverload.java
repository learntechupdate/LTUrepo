package learningGD;

class ConstructorOverload
{
	ConstructorOverload()
	{
		this(30,40.90);		//Overload the constructor
		ConstructorOverload c4=new ConstructorOverload("janarhana @@@@@@@@######");
	 int i=10;						// we can create object reference within 
									// a constructor or method
	 int j=20;
	 //this(30,40);			//Error this is the first statement in the constructor
	 System.out.println("the vale of i & j is :"+i+" "+j);
	
	}
	
	ConstructorOverload(int k, double l)
	{
		
		//this("Janardhan");		//Overload the constructor
		System.out.println("The value of k & l is:"+k+" "+l);
	
	}
	
	ConstructorOverload(String s)
	{
		//this();
		System.out.println("String is:"+s);
	}
	
	public static void main(String[] args)
	{
		ConstructorOverload c1=new ConstructorOverload();
		//ConstructorOverload c2=new ConstructorOverload(10,20.80);
		//Constructor c3=new Constructor(30,30.3333);
		//ConstructorOverload c4=new ConstructorOverload("Parameterized constructor");
	}
}

