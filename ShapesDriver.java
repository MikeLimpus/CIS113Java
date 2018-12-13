
public class ShapesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables and Objects 
		Box box = new Box(5.5, 2.2, -7.7, 1.0, 4.0, 2.0, 1.0);
		Sphere sphere = new Sphere(-5.5, -2.2, 7.7, 1.0, 10);
		
		System.out.println("Box:\n\n\n");
		box.print();
		System.out.println("Sphere:\n\n\n");
		sphere.print();
		
		box.setScale(3.0);
		box.setPos(0, 0, 0);
		System.out.println("Box:\n\n\n");
		box.print();
		sphere.setScale(10.0);
		sphere.setPos(5.0, -10.0, 4.4);
		System.out.println("Sphere:\n\n\n");
		sphere.print();
	}

}
