package javainterview;

import java.util.ArrayList;

/*
 if n=3;
 1
 12
 123
 
 store in array
 */
public class Try {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int n=3;
		int len=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;i>=j;j++)
			{
				a1.add(j);
			}
		}
		System.out.println(len);
		System.out.println(a1);
	}
}
