package learningGD;

public abstract class Calci {
	abstract void add(int x, int y);
	 void multiply(int x, int y) {
		 System.out.println("Multiplication of "+(x*y));
		 
	}

}


class CalciImplementation extends Calci
{
	 void add(int x, int y)
	 {
		 System.out.println((x+y));
	 }
	
}

class CalciEnhancement extends CalciImplementation
{
	void add(int x,int y)
	{
		//super.add(x, y);
		System.out.print("Addition of "+x+"+"+y+" = ");
		super.add(x, y);
		}
	void multiply(int x, int y) {
		 System.out.println("Multiplication of "+x+"*"+y+"="+(x*y));
		 
	} 
}