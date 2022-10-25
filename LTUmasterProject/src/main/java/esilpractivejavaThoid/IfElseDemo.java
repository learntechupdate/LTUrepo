package esilpractivejavaThoid;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int x = 2;
        int y = 6;
        System.out.println(power(x, y));

	}

	//using divide and conquer method
	private static int power(int x, int y) {
		int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
 
        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
	}

}
