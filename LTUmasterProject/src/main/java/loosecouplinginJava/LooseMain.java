package loosecouplinginJava;

public class LooseMain {

	public static void main(String[] args) {

		//changes in Helper will not affect the input
		HelperBank.getObject("Sgg", 2, 4, 7);

	}

}
