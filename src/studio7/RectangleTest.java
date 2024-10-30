package studio7;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(1.0,2.0);
		double area1 = rec1.area();
		double perimeter1 = rec1.perimeter();
		boolean square1 = rec1.square();
		
		Rectangle rec2 = new Rectangle(3.0,5.0);
		double area2 = rec2.area();
		double perimeter2 = rec2.perimeter();
		boolean square2 = rec2.square();
		
		boolean F_larger = area1 > area2;
		
		rec1.draw();
		System.out.println("First one is larger? " + F_larger);
		System.out.println("The area of Rectangle 1 is " + area1 + " and perimeter is " + perimeter1 + " and it is a square ? " + square1);
		System.out.println("Is first square is larger than second one? " + F_larger);
	}

}
