package practicejava.naseema;

class A{
	
	public int  add(int n1,int n2){
		int result=n1+n2;
		return result;
	}
	
}

class B{
	
	public int  sub(int n1,int n2){
		int result=n1-n2;
		return result;
	}
		
}

public class InheritaceDemo {

	public static void main(String[] args) {
		
		A ref=new A();
		int addresult=ref.add(1, 2);
		System.out.println(addresult);
		
		B refb=new B();
		int subresult=refb.sub(3, 1);
		System.out.println(subresult);
		
	}
}
