package hw3;

import java.util.Scanner;

public class hw3_3 {
	public static void main(String[] args) {
		System.out.println("-------第三題-------");

		System.out.println("阿文,請輸入你討厭哪個數字");
		Scanner a = new Scanner(System.in);
		// num -> 輸入的數字
		// i -> 輸入數字後畫面顯示的號碼
		int num;
		// 輸入數字
		num = a.nextInt();

		while (num <= 0 || num > 9) {
			System.out.println("輸入錯誤!請輸入1到9的數字");
			num = a.nextInt();
		}
		// Total -> 數字總共有幾個
		int Total = 0;
		for (int i = 1; i < 50; i++) {
			if (i % 10 == num || i / 10 == num) {
				continue;
			}
			System.out.print(i + "  ");
			if (i < 10)
				System.out.print(" ");
			Total++;
			if (Total % 6 == 0) {
				System.out.println();
			}
		}
		System.out.print("總共有" + Total + "個數字可選");
		System.out.println();
		// -------------------------進階挑戰-------------------------
		
		//新增陣列
		int a1[] = new int[6];
		//資料歸零
		for(int i = 0; i < 6; i++){
			a1[i] = 0;
		}
		//宣告顯示幾次的數字
		int count = 0;

		System.out.print("隨機印出六個數字為"+" ");
		while (count < 6)
		{
			//每次要判斷有沒有重複,要重新預設為false
			boolean bRepeat = false;
			//亂數1~49
			int r = (int)(Math.random() * 49) + 1;
			//有不喜歡的數字就跳過
			if (r % 10 == num || r / 10 == num) {
				continue;
			}
			//判斷array裡面有沒有重複 //寫count是因為可以減少次數
			for(int i = 0; i < count; i++)
			{
				if (a1[i] == r) {
					bRepeat = true;
				}
			}
			//沒有重複的話 才顯示數字
			if (!bRepeat) {
				System.out.print(r+ "  ");
				a1[count] = r; 	//塞資料
				count++;		//計數
			}
			
		}
	}
}

