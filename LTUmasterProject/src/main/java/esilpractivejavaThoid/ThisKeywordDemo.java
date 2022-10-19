package esilpractivejavaThoid;


class Athis
{
	int varresult;
	
	public Athis(int varresult) {
         this(); //constructor call with this keyword and it should be the 1st line
		this.varresult=varresult;//if this is not used the default value of varresult is  displayed
		//to the parameter value
		
	}
	
	
	public Athis() {
		varresult=1;
	}
	
}
public class ThisKeywordDemo {
	
	public static void main(String[] args) {
		
		Athis obj=new Athis(4);
		System.out.println(obj.varresult);
		
	}

}
