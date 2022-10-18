package javaconcepts;

class CalcVar{
	
	public void add (int ...n)// this will feed as array
	{		
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			sum=sum+n[i];
			
		}
		System.out.println(sum);
		
	}
}

public class VarargsDemo {
	
	public static void main(String[] args) {
		
		CalcVar xy = new CalcVar ();
		xy.add(4,6, 5);
		
	}

}
