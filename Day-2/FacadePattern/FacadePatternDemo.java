package FacadePattern;

import java.util.Scanner;

public class FacadePatternDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeMaker shape = new ShapeMaker();
		System.out.println("Enter 1 for Circle");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Square");
		System.out.println("Enter your choice");
		switch (sc.nextInt()) {
		case 1:
			shape.drawCircle();
			break;
		case 2:
			shape.drawRectangle();
			break;
		case 3:
			shape.drawSquare();
			break;
		default:
			System.out.println("Wrong choice.");
		}
	}

}
