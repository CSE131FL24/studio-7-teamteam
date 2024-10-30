package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private static double length;
	private static double width;
	
	public Rectangle(double length, double width) {
		this.width = width;
		this.length = length;
	}
	
	public static double getLength() {
		return length;
	}
	public static void setLength(double length) {
		Rectangle.length = length;
	}
	public static double getWidth() {
		return width;
	}
	public static void setWidth(double width) {
		Rectangle.width = width;
	}
	
	public double area() {
		return width*length;
	}
	
	public double perimeter() {
		return (width+length) * 2.0;
	}
	
	public boolean square() {
		return width == length;
	}
	
	public void draw() {
		StdDraw.clear();
		StdDraw.text(0.1, 0.2, "1:10");
		StdDraw.filledRectangle(0.4, 0.2, width/20, length/20);
//		StdDraw.rectangle(10, 10, width/2, length/2);
	}

}
