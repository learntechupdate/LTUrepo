package esiljavapractiveThoid;

public class EncapuslationDemo {
	
	private int idNo;
	private String name;
	private String companyName;
	
	public EncapuslationDemo(){
		
		this.companyName="LTU";
	}
	
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
		System.out.println("Id No set as " +idNo);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name No set as " +name);
	}
	public String getCompanyName() {
		return companyName;
	}
	
	
	
	
}
