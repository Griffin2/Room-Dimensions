package LAB3;

import java.util.Scanner;

public class RoomDriver {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double l;
		double w;
		double c;

		System.out.println("Input Room Length: ");
		l = read.nextDouble();
		read.nextLine();
		System.out.println("Input Room Width: ");
		w = read.nextDouble();
		read.nextLine();
		System.out.println("Input Carpet Cost: ");
		c = read.nextDouble();
		read.nextLine();

		RoomCarpet carpet = new RoomCarpet(new RoomDimension(l, w), c);
		System.out.println(carpet.toString());
		read.close();

	}

}
