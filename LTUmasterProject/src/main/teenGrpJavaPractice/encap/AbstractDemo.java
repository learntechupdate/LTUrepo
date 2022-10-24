/**
 * 
 */
package selenium;

/**
 * @author Janardhan
 *
 */
public abstract class AbstractDemo 
{
	public void companyDetails()
	{
		String s="IBM";
		String addr="Bangalore";
		System.out.println(s+" "+addr);
	}
	public abstract void empDetails();
	public abstract void projectDetails();
		
	}

 abstract class Emp extends AbstractDemo
{
	 public void empDetails()
	{
		String name="Janardhan";
		int empid=102145;
		System.out.println(name+" "
		+empid);
	}
	 
	 
	
}
 
 class Project extends Emp
 {
	  public void projectDetails()
	  {
		  String pname="Erp";
		  int noemp=200;
		  System.out.println(pname+" "+noemp);
	  }

	
 }

