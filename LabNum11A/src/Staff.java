
public class Staff extends Person{
	
	private  String school;
	private double pay;
	
	
	public Staff(String name, String address,String school,double pay) {
		super(name, address);
		setSchool(school);
		setPay(pay);
	}
	
	//getters and setters
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public void printStaff(){
		System.out.println(getName()+": "+getAddress()+": "+school+": "+ pay);
	}
	

}
