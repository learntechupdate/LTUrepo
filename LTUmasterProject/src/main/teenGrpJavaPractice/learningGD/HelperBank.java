package learningGD;

public class HelperBank
{
public static BankDetailsEnhancement getObject(String name, int accountNo, double bal, double l)
	{
	
	return new BankDetailsEnhancement(name, accountNo, bal, l);
	}
}
