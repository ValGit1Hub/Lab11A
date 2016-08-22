
public class Cylinder extends Circle{
	private double height;

	//constructor
	public Cylinder(){
		super();
		setHeight(1.0);
	}
	
	public Cylinder(double radius) {
		super(radius);
		setHeight(1.0);
		
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		setHeight(height);
	}
	
	public Cylinder(double radius, double height,String color){
		super(radius,color);
		setHeight(height);
		
	}
	
	//getter and setters
	public double getHeight() {
		return height;
	}

	

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume(){
		double volume = getArea() * getHeight();
		return volume;
		
	}
	public void printArea(){
	//	System.out.println("I want to override Circle");
		System.out.println(getArea());
	}
	public void printVolume(){
		System.out.println(getVolume());
	}
	@Override 
	// need to get the area of a cylinder. not circle
	public double getArea(){
		double area =((2* Math.PI *(getRadius()*getHeight()))+2*(Math.PI*getRadius()));
		
		return area;
	}
	
}
