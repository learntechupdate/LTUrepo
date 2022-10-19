package esilpractivejavaThoid;

public class AbstractDemoMain extends AbstractDemo {

	public static void main(String[] args) {

		AbstractDemoMain objref=new AbstractDemoMain();
		objref.add(3, 2);
		
	}

	//concrete class
	@Override
	public void add(int a, int b) {
	
		int sum=a+b;
			
		show(sum);
		
	}

	

}
