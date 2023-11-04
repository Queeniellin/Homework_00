package hw10;

import static java.lang.System.out;
import java.util.Scanner;

public class hw10_2 {
	public static void main(String[] args) {
		out.println("-------第二題-------");
		out.println("請輸入數字：");
		
		String numcheck = "^\\d+\\S$";
		
		Scanner sc=new Scanner(System.in);
		String num = sc.next();
		
		
		if(num.matches(numcheck)) {
			out.println(num);
		}else {
			out.println("輸入格式不正確,請再輸入一次!");
		}
		
		
	}
}
