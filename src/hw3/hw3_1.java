package hw3;

import java.util.Scanner;

public class hw3_1 {
	public static void main(String[] args) {
		System.out.println("-------第一題-------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		while(side1<=0||side2<=0||side3<=0) {
			System.out.println("輸入錯誤,請重新輸入大於0的數字");
			side1 = sc.nextInt();
			side2 = sc.nextInt();
			side3 = sc.nextInt();
		}
		
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
			System.out.println("不是三角形");
		}
		else
		{	
			boolean bIs90 = false;
			if (side1 * side1 + side2 * side2 == side3 * side3 || side2 * side2 + side3 * side3 == side1 * side1
				|| side1 * side1 + side3 * side3 == side2 * side2) {	
				bIs90 = true;
			}
			
			if(side1 == side2 && side2 == side3){
				System.out.println("正三角形");
			}
			else if(side1 == side2 || side2 == side3 || side1 == side3) {
				
				if(bIs90) {
					System.out.println("等腰直角三角形");
				}
				else {
					System.out.println("等腰三角形");
				}
			}
			else if(bIs90){
				System.out.println("直角三角形");
			}
			else {
				System.out.println("其他三角形");
			}
		}
	}
}
