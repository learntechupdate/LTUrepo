package javaIQ;

public class MatricMultiDemo {

	public static void main(String[] args) {

		
		int a[][]= {
				     {2,2,2},
				     {2,2,2},
				     {2,2,2}				
		           };
		
		int b[][]= {
			     {2,2,2},
			     {2,2,2},
			     {2,3,2}				
	           };
		
		
		int c[][]=new int[3][3];
		
		
		
		for(int i=0;i<a.length;i++){    
		    
			for(int j=0;j<b.length;j++){    
		    c[i][j]=0;      
		    
			    for(int k=0;k<3;k++)      
			    {      
			    c[i][j]+=a[i][k]*b[k][j];      
			    }//end of k loop  
		    System.out.print(c[i][j]+" ");  //printing matrix element  
		    }//end of j loop  
		    System.out.println();//new line    
		    }    
		
		
		
	}

}
