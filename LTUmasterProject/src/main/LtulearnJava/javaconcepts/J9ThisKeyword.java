package javaconcepts;

class Sum {
	
	int num1;
	int num2;
	int result;
	
//	int result=num1+num2;//initially num1,num2 =0;
	
	public Sum(int num1,int num2){
		
		this.num1=num1;//current object
		this.num2=num2;
//		this.result=this.num1+this.num2;
		System.out.println(this.num1+this.num2);
		System.out.println(this.result);//o/p = 0 ?
	}
}

public class J9ThisKeyword {
	
	public static void main(String[] args) {
		
		Sum s1=new Sum(2, 3);
	}
	
	

}
