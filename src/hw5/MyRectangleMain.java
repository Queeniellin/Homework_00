package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {

		MyRectangle R1 = new MyRectangle();
		MyRectangle R2 = new MyRectangle(10, 20);

		R1.setWidth(10);
		R1.setdepth(20);
		System.out.println(R1.getArea());
		System.out.println(R2.getArea());
	}
}
