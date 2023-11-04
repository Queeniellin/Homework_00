package hw4;

import java.util.Scanner;

public class hw4_4 {
	public static void main(String[] args) {
		System.out.println("-------第四題-------");
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入要借多少錢");
		
		//m -> 輸入要借多少錢
		int m = sc.nextInt();
		int no [][]= {{25,2500}, // 00  01
					  {32,800},  // 10  11
					  {8,500},   // 20  21
					  {19,1000}, // 30  31
					  {27,1200}};// 40  41
		

		while(m<=0) {
			System.out.println("輸入錯誤!請重新輸入大於0的數字");
			m = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < no.length; i++) {
			//  no[i][0] --> 員編
			//  no[i][1] --> 錢
			if(no[i][1] <= m){
				System.out.println(no[i][0]);
				count ++;
				
			}
		}
		System.out.println("有錢可借的員工編號:共"+count+"人");
		
		
		
		
	}
}
