/*
 * Jonathan Limpus
 * CIS 113 Midterm
 * Box.java
 */


public class Box extends Shapes {
	private double height, width, depth, volume;
	
	public Box() {
		//This is the default constructor for Box
		super();
		height = 0.0;
		width = 0.0;
		depth = 0.0;
		calculateVolume();
	}
	
	public Box(double xPos, double yPos, double zPos, double scale, double height, double width, double depth) {
		//This is the parameterized constructor
		super(xPos, yPos, zPos, scale);
		this.height = height;
		this.width = width;
		this.depth = depth;
		calculateVolume();
	}
	//These are accessor methods
	public double getHeight() {
		return height; 
	}
	public double getWidth() { 
		return width; 
	}
	public double getDepth() {
		return depth;
	}
	public double getVolume() {
		return volume;
	}
	//These are the mutator methods
	public void setHeight(double height) { 
		this.height = height; 
		calculateVolume();
	}
	public void setWidth(double width) {
		this.width = width;
		calculateVolume();
	}
	public void setDepth(double depth) {
		this.depth = depth; 
		calculateVolume();
	}
	
	public void calculateVolume() {
		volume = height * width * depth;
	}
	
	@Override 
	public void print() {
		//Debug function to print every data field in class
		super.print();
		System.out.println(
			"\nHeight = " + height +
			"\nWidth = " + width +
			"\nDepth = " + depth +
			"\nVolume = " + volume +"\n" 
 			);
	}
	
	@Override
	public void setScale(double scale) {
		this.scale = scale;
		height *= scale;
		width *= scale;
		depth *= scale;
		calculateVolume();
	}
}
