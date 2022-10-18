package practicejava.naseema;

class A1{
	
	public int  add(int n1,int n2){
		int result=n1+n2;
		return result;
	}
	
}

class B1 extends A1{
	
	public int  sub(int n1,int n2){
		int result=n1-n2;
		return result;
	}
		
}

class C1 extends B1{
	
	public int  mul(int n1,int n2){
		int result=n1*n2;
		return result;
	}
		
}

public class InheritaceDemo2 {

	public static void main(String[] args) {
		
		C1 ref=new C1();
		
		
		
	}
}
