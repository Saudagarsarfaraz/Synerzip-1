package assignment;

public class Employee1 {
	int eId;
	String eName;
	String eMail;
    String eAdd;
	public Employee1(int eId, String eName, String eMail, String eAdd) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eMail = eMail;
		this.eAdd = eAdd;
	}
    public void getEmpDetails() {
    	System.out.println("Employee Details");
    	System.out.println("----------------");
    	System.out.println("Emp ID:"+eId);
    	System.out.println("Emp Name:"+eName);
    	System.out.println("Emp Mail:"+eMail);
    	System.out.println("Emp Address:"+eAdd);
    } 
}
