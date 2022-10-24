package javanotes;

public class Unary1 
{

	public static void main(String[] args) 
	{
		int i=10;
		int x=5;
		x=++i + x++ + i++;   //post(inc/dec) increment value then assign , Pre(inc/dec) vice versa
		System.out.println(x);
			
	}
}
