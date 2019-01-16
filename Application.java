//Ethan K

public class Application {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		System.out.println(c.calculateArea());
		
		Circle c2 = new Circle(2.3);
		System.out.println(c2.toString());
		System.out.println(c2.calculateArea());
		
		Circle c3 = new Circle(0.9);
		System.out.println(c3.toString());
		System.out.println(c3.calculateArea());
	}
}