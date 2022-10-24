package encapsulation;

public class Account {
	private int accno;
	private String name;
	private int bal;
	
	
	public Account(int accno, String n, int b) {
		// TODO Auto-generated constructor stub
		//http://www.javatpoint.com/constructor
		this.accno=accno;
		name =n;
		bal=b;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("")){
		this.name = "anushuk";}
		else
		{this.name=name;}
		}
	
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	

}
