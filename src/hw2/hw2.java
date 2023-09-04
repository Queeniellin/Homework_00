package hw2;

public class hw2 {
	public static void main(String[] args) {
		// 第一題
		System.out.println("-------第一題-------");
		int sum = 0;
		for (int a = 2; a <= 1000; a++)
			if (a % 2 == 0) {
				sum += a;
			}
		System.out.println("偶數和為:" + sum);

		// 第二題
		System.out.println("-------第二題-------");
		int num = 1;
		for (int b = 1; b <= 10; b++) {
			num *= b;
		}
		System.out.println("使用for迴圈乘積為:" + num);

		// 第三題
		System.out.println("-------第三題-------");
		int num2 = 1;
		int c = 1;

		while (c < 10) {
			c++;
			num2 *= c;
		}
		System.out.println("使用while迴圈乘積為:" + num2);

		// 第四題
		System.out.println("-------第四題-------");
		for (int d = 1; d <= 10; d++)
			System.out.print(d * d + " ");

		// 第五題 //4.14.24.34.40-49
		System.out.println("-------第五題-------");
		for (int num3 = 1; num3 < 50; num3++)
			System.out.println(num3);

		// 第六題
		System.out.println("-------第六題-------");
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 11 - y; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		// 第七題
        System.out.println("-------第七題-------");
        for(int y1=1;y1<=6;y1++) {
        	for(int x1=1;x1<y1;x1++) {
        		System.out.print("A");
        	}
        	System.out.println("A");
        }
	}
}
		