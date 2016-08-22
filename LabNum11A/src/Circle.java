
public class Circle {

	private double radius;
	private String color;
	
	
	/**
	 * Constructor
	 */
	public Circle(){
		setRadius(1.0);
		setColor("red");
	}
	
	public Circle(double radius){
		setRadius(radius);
		setColor("red");
	}
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}
	//getters and setters
	public double getArea(){
		double area =0d;
		area = Math.PI *(radius*radius);
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void printArea(){
		System.out.println(getArea());
	}
	
}
