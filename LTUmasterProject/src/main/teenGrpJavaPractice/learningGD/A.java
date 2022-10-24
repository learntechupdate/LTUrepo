package learningGD;

public class A {

 int i=10;
 int j=20;
 void add()
 {
	 int sum=i+j;
	 System.out.println("sum is :" +sum);
	
 }
}
  class B extends A
  {
	  void sub()
	  {
		 int  y=40;
		 int sub=y-j;
		 System.out.println(sub); 
		 
	  }
  }

 class C extends B {
	 
	 void div()
	  {
		 int  x=40;
		 int div=x/j;
		 System.out.println(div); 
		 
	  }
 }
  
