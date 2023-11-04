package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = 0;
		int y = 0;

		while (true) {
			while (true) {

				try {
					System.out.println("請輸入x的值");
					x = scan.nextInt();
					break;

				} catch (InputMismatchException e) {
					System.err.println("格式輸入錯誤,請輸入整數！");
					scan.next();
				}
			}

			while (true) {

				try {
					System.out.println("請輸入y的值");
					y = scan.nextInt();
					break;

				} catch (InputMismatchException e) {
					System.err.println("格式輸入錯誤,請輸入整數！");
					scan.next();
				}
			}

			try {
				Calculator c = new Calculator(x, y);
				System.out.println(x + "的" + y + "次方等於" + c.powerXY());
				break;
			} catch (CalException e) {
				e.printStackTrace();

			}

		}

	}
}
