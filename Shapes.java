
public abstract class Shapes {
	protected double xPos, yPos, zPos, scale;
	
	public Shapes() {
		xPos = 0.0;
		yPos = 0.0;
		zPos = 0.0;
		scale = 0.0;
	}
	
	public Shapes(double xPos, double yPos, double zPos, double scale) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
		this.scale = scale;
	}
	
	// Accessors
	public double getX() {return xPos;}
	public double getY() {return yPos;}
	public double getZ() {return zPos;}
	public double getScale() {return scale;}
	// Mutators
	public void setX(double xPos) {this.xPos = xPos;}
	public void setY(double yPos) {this.yPos = yPos;}
	public void setZ(double zPos) {this.zPos = zPos;}
	public void setScale(double scale) {this.scale = scale;}
	public void setPos(double xPos, double yPos, double zPos) {
		// quicker way of setting position 
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
	}
	public void print() {
		System.out.println("X Position = " + xPos);
		System.out.println("Y Position = " + yPos);
		System.out.println("Z Position = " + zPos);
		System.out.println("Scale = " + scale);
	}
}
