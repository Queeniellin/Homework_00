package hw5;

public class MyRectangle {
	double width;
	double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setdepth(double depth) {
		this.depth = depth;
	}

	// 計算長方形面積
	double getArea() {

		return this.width * this.depth;
	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

}
