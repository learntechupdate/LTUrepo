
public class Star 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++) 
		{
			int j;
			for ( j = 1; j <=i; j++) 
			{
				System.out.print("*");
			}
			
			for (int k = 3; k < (4-j); k--) 
			{
				System.out.println(" ");
			}
			
			System.out.println("");
		}
		
	}
}

