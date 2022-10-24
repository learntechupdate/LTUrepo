package javaprograms.InterviewQ;


	//A number only divisible by itself and 1
	//n=9 divide from 2 to 8 : by divisible by 3 : their fore 9 is Not prime
	//n=7 divide form 2 to 6 : No divisible by any number : therefore 7 is prime
	public class Prime {
		
		public static void checkPrime(int n)
		{
			int remCount=0;
			if(n==1) {
				System.out.println("Enter valid number and retry again");
			}
			else {
				for(int i=2;i<n; i++) {
					if(n%i==0) {
						remCount++;
					}
					
				}
				
				if(remCount>0) {
					System.out.println(n+" Not a Prime Number");
				}
				else {
					System.out.println(n+" is  Prime Number");
				}
			}
		}
		
		public static void main(String[] args) {
			
			java.util.Scanner scn=new java.util.Scanner(System.in);
			System.out.println("Enter the number to check prime");
			int n=scn.nextInt();
			Prime.checkPrime(n);
			scn.close();
		}
		
}


