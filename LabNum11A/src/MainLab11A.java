
public class MainLab11A {
	public static void main(String[] args) {
		Circle c1 = new Circle(3,"blue");
		Cylinder cy1 = new Cylinder(5.0,10);
		c1.printArea();//area from circle
		cy1.printVolume();
		cy1.printArea();//overriding
		Student st1 = new Student("Valerie Smith","123 Noway Lane","Java Prg",2016,7500.00);
		st1.printStudent();
		Staff stf = new Staff("Valerie Smith","123 Noway Lane","Standford",4000.00);
		stf.printStaff();
	}

}
