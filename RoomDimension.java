package LAB3;

public class RoomDimension {
	private double length;
	private double width;

	public RoomDimension(double len, double width) {
		this.length = len;
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public String toString() {
		return "length: " + this.length + "\nwidth: " + this.width + "\narea: " + getArea();
	}
}
