package loosecouplinginJava;

public class HelperBank
{
	//change in class name will not effect the calling class provided the Method arguments does not change
public static BankDetailsEnhancement getObject(String name, int accountNo, double bal, double l)
	{
	
	return new BankDetailsEnhancement(name, accountNo, bal, l);
	}
}
