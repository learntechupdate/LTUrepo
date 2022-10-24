package encap;


class Account {
private int accno;
private String name;
private int bal;

public Account(int i, String string, int j) 
{
	accno=i;
	name=string;
	bal=j;
}
	

public int getAccno(){
	return accno;
}

/*public void setAccno(int accno) {
	this.accno = accno;
}*/
public String getName() {
	return name;
}

public void setName(String name) {
	if(name.equals(""))
		{
			this.name="Anuskur";
		}
	else
	{
		this.name = name;
	}
}

public int getBal() {
	return bal;
}

public void setBal(int bal) {
	this.bal = bal;
}



}
