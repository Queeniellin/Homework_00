package hw6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {

		setx(x);
		sety(y);

	}

	public int getx() {
		return x;
	}

	public void setx(int x) throws CalException {

		this.x = x;

	}

	public int gety() {
		return y;
	}

	public void sety(int y) throws CalException {

		if (y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		} else
			this.y = y;

	}

	public int powerXY() {

		return (int) (Math.pow(x, y));
	}
}
