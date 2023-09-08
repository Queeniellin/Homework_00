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
		int num1 = 1;
		int c = 1;

		while (c < 10) {
			c++;
			num1 *= c;
		}
		System.out.println("使用while迴圈乘積為:" + num1);

		// 第四題
		System.out.println("-------第四題-------");
		for (int d = 1; d <= 10; d++) {
			System.out.print(d * d + " ");
		}
		System.out.println();

		// 第五題 //4.14.24.34.40-49
		System.out.println("-------第五題-------");
		for(int ans=1;ans<50;ans++) {
			if(ans%10==4||ans/10==4){
				continue; 
			}
			System.out.print(ans+" ");
		}
		// 第六題
		System.out.println();
		System.out.println("-------第六題-------");
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 11 - y; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

		// 第七題
		int i = 0;
		System.out.println("-------第七題-------");
//		for (char y1 = 65; y1 <= 70; y1++) {
//			for (int j=0; j< i; j++) {
//				System.out.print(y1);
//			} 
//			i++;
//			System.out.println(y1);
//		}
		for (char y = 65; y < 71; y++) {
			for (char x = 65; x <= y; x++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}