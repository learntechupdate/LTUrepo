
public class Account implements Comparable
{
	String name;
	int accno;
	
	public Account(String name, int accno) {
		super();
		this.name = name;
		this.accno = accno;
	}
	@Override
	public String toString() {
		//		return super.toString();
		return "[Name]"+ name+": [AccountNo]" +accno;
	}
	@Override
	public boolean equals(Object x) {
		
		//return super.equals(arg0);
		return accno==((Account)x).accno;
	}
	@Override
	public int compareTo(Object x) {
		//return 0;
		
		return (accno-((Account)x).accno);
	}
	@Override
	public int hashCode() {
		
		//return super.hashCode();
		if(accno<500)
			return 1;
			else
				return 2;
		
	}

	
	
}
