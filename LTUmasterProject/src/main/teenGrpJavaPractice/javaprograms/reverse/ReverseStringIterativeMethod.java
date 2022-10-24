package javaprograms.reverse;

public class ReverseStringIterativeMethod {
	
	public static void main(String[] args)
    {
        String str = "MyJava";
        
      //2. Using iterative method
        char[] strArray = str.toCharArray();
        
        for (int i = strArray.length - 1; i >= 0; i--)
        {
            System.out.print(strArray[i]);    //Output : avaJyM
        }
 
        System.out.println();

    }
}
