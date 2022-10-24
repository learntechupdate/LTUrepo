package classloading;

 class A
{ //System.out.println("class A loaded"); misplaced
    
  public static final char[] staticMethod = null;
A()//constructor
    {
	 System.out.println("Class A constructor loaded"); 
    }
  
 static
 {
	 System.out.println("Static block loaded");
 }
 //non static block
 {
	 System.out.println("Non static block loaded");
 }
 
 static int staticMethod()
 {
	System.out.println("Static method called"); 
	return(0);	
 }
 void Method()
 {
	System.out.println("Non static method called"); 
 }
}
 
 
