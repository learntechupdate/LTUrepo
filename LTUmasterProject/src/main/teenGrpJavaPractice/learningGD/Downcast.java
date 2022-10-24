package learningGD;

       public class Downcast {
		public static void main(String[] args)
	{
		Y d = (Y) new X();
		System.out.println(d.m);
	}

}
class X 
{
	int i;
	int j;
	void dis()
	{
		System.out.println(i);
	}
}

class Y extends X
{
	int m=10;
	int n;
	
}
