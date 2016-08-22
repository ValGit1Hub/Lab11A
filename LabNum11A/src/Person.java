
public class Person {
	private String name;
	private String address;
	
	
	
	/**
	 * @param name
	 * @param adress
	 */
	public Person(String name, String address) {
		super();
		setName(name);
		setAddress(address);
	}
	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
