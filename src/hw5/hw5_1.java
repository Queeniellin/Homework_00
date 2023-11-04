package hw5;

import java.util.Scanner;

public class hw5_1 {
	public static void main(String[] args) {
		System.out.println("-------第一題-------");

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬跟高");
		int w = sc.nextInt();
		int h = sc.nextInt();

		while (w == h) {
			System.out.println("長方形的高與寬不相等!請重新輸入高與寬");
			w = sc.nextInt();
			h = sc.nextInt();

		}

		starSquare(w, h);
	}

	public static void starSquare(int width, int height) {

		for (int j = 1; j <= height; j++) {
			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}


	}
}
