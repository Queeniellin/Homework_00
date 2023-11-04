package hw10;

public class hw10_1 {
	public static void main(String[] args) {
		System.out.println("-------第一題-------");

		// i -> 跑幾次
		int i = 0;
		while (i < 5) {
			int r = (int) (Math.random() * 100) + 1;

			if (r % 2 != 0) {
				System.out.println(r + "是質數");
			} else {
				System.out.println(r + "不是質數");
			}
			i++;
		}
	}
}
