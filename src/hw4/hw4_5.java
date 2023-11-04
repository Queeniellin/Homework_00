package hw4;

import java.util.Scanner;

public class hw4_5 {
	public static void main(String[] args) {
		System.out.println("-------第五題-------");
		System.out.println("請輸入三個數字分別為西元年、月、日");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		// 假設b -> 不是閏年
		boolean b = false;

		if (y % 4 == 0) {
			if (y % 100 != 0 || y % 400 == 0) {
				// System.out.println("閏年");
				b = true;
			}
		}

		// 月-平年陣列

		int[] Arrays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 如果是閏年,將二月替換成29天
		if (b) {
			Arrays[1] = 29;
		}

		int Total = 0;
		for (int i = 0; i < m - 1; i++) {
			Total += Arrays[i];

		}
		System.out.println("輸入的日期為該年的第" + (Total + d) + "天");

	}
}
