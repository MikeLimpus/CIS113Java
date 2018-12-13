
public class Sphere extends Shapes {
	double radius, volume;
	
	public Sphere() {
		super();
		radius = 0.0;
		calculateVolume();
	}
	
	public Sphere(double xPos, double yPos, double zPos, double scale, double radius) {
		super(xPos, yPos, zPos, scale);
		this.radius = radius;
		calculateVolume();
	}
	// Accessors
	public double getRadius() {return radius;}
	public double getVolume() {return volume;}
	// Just one mutator for radius
	public void setRadius(double radius) {
		this.radius = radius;
		calculateVolume();
	}
	
	public void calculateVolume() {
		volume = 4.0 / 3.0 * Math.PI * (radius * radius * radius);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Volume =  " + volume );
		System.out.println("Radius = " + radius);
	}
	
	@Override
	public void setScale(double scale) {
		this.scale = scale;
		radius *= scale;
		calculateVolume();
	}
}
