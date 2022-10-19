package esilpractivejavaThoid;

public class ArrayDemo {
	
	
	int lowestInterger(int a[]){
		int leastNo = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (leastNo>a[i]) {
				leastNo=a[i];
			}
		}	
				
		return leastNo;
		
		
		
	}
	
	

}
