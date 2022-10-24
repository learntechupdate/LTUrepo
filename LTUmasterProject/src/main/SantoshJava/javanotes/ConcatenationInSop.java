package javanotes;

public class ConcatenationInSop 
{

	public static void main(String[] args) {
		
       int x=10,y=5;
		
		y=++x-x--;
		x=--y + ++y +x++;
	    System.out.println(y);
	    System.out.println(x);
	    
	    System.out.println("x = "+x);// concatenation
	    System.out.println(x+y);
	    System.out.println("varma is having "+(y+x)+" Rs");
	    System.out.println("Santosh is having "+x+y+" Rs"); // to clarify
	}
}
