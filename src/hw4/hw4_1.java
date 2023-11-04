package hw4;

public class hw4_1 {
	public static void main(String[] args) {
		System.out.println("-------第一題-------");

		int[] Array1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 總和
		int sum = 0;
		for (int i = 0; i < Array1.length; i++) {
			sum += Array1[i];
		}
		System.out.println("總和為" + sum);

		// 平均值
		int avg;
		avg = sum / Array1.length;
		System.out.println("平均值為" + avg);

		// 比平均數大的數字
		int m;
		System.out.print("大於平均數的數字為");
		for (int j = 0; j < Array1.length; j++) {
			if (Array1[j] > avg) {
				System.out.print(Array1[j] + " ");
			}
		}

	}
}
