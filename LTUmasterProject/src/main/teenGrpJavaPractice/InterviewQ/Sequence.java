package javainterview;
/*
54321
4321
321
21
1
*/
public class Sequence{ 
public static void main(String[] args) 
{
	for (int i =5; i>=1; i--) 
	{
		int n=5;
		for (int j=n;j>=1 ; j--){
		
			if(i>=j)
			  {
				System.out.print(j);
			  }
		 }
		n--;
		System.out.println();
	}
}
}
