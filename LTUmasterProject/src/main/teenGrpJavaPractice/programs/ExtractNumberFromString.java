package programs;

public class ExtractNumberFromString {
	
	public static void main(String[] args) {
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the string having numbers");
		String inputString= scn.nextLine();
		

		String outputString= "";

		for(char ch : inputString.toCharArray() )
		{
			if (Character.isDigit(ch)) {
				
				outputString=outputString+ch;
			}
		}
		
		System.out.println(outputString);

		//Integer.parseInt() - to convert actual integer
	}

}
