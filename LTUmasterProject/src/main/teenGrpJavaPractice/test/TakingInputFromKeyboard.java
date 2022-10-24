package test;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		System.out.println("Enter the value of x & y");
		java.util.Scanner ip=new java.util.Scanner(System.in);
		int x=ip.nextInt();
		int y=ip.nextInt();
		System.out.println("x+y="+(x+y));

	}

}
