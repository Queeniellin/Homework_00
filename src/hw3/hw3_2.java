package hw3;

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
		System.out.println("-------第二題-------");
		int i;
		i = (int) (Math.random() * 9);
		System.out.println("開始猜數字吧!");
		Scanner a = new Scanner(System.in);
		
		//有沒有猜對設定->沒有
		boolean bIsNum = false;
		int num = 0;
		while (bIsNum == false) {
			num = a.nextInt();

			if (num == i) {
				// 成功
				bIsNum = true;
				System.out.println("答對了!答案就是" + i);
			} else {
				// 錯誤
				System.out.println("猜錯囉!");
			}
		}
		System.out.println("-----第二題進階-----");
		int j;
		j = (int) (Math.random() * 100);
		System.out.println("開始猜數字吧!");
		Scanner a1 = new Scanner(System.in);
		
		//有沒有猜對設定->沒有
		boolean bIsNum1 = false;
		int num1 = 0;

		while (bIsNum1 == false) {
			num1 = a1.nextInt();

			if (num1 == j) {
				bIsNum1 = true;
				System.out.println("答對了!答案就是" + j);
				// 成功
			} else if (num1 < j) {
				// 錯誤
				System.out.println("猜錯囉!是大於正確答案的數字");
			} else
				System.out.println("猜錯囉!是小於正確答案的數字");
		}
	}
}
