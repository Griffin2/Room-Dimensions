package LAB3;

public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;

	public RoomCarpet(RoomDimension dim, double cost) {
		this.size = dim;
		this.carpetCost = cost;
	}

	// methods
	public double getTotalCost() {
		return this.size.getArea() * this.carpetCost;
	}

	// overloaded method
	public double getTotalCost(double discount) {
		return ((this.size.getArea() * this.carpetCost) - discount);
	}

	public String toString() {
		return this.size.toString() + "\ncost: $" + this.getTotalCost();
	}
}
