package esiljavapractiveThoid;


class Athis
{
	int varresult;
	
	public Athis(int varresult) {
		this.varresult=varresult;//if this is not used the defualt value of varresutl is  displayed
		//to the parameter value
	}
	
}
public class ThisKeywordDemo {
	
	public static void main(String[] args) {
		
		Athis obj=new Athis(4);
		System.out.println(obj.varresult);
		
	}

}
