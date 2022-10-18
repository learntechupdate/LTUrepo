package esiljavapractiveThoid;

public class ArrayDemoMain {
	
	public static void main(String[] args) {
		
		int[] a= new int[4];
		a[0]=13;
		a[1]=55;
		a[2]=33;
		a[3]=41;
		
		ArrayDemo arraydemo=new ArrayDemo();
		
		
		System.out.println(arraydemo.lowestInterger(a));
	}

}
